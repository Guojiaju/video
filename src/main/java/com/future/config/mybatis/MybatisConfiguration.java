package com.future.config.mybatis;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ConditionalOnClass({ EnableTransactionManagement.class})
@AutoConfigureAfter({ DataBaseConfiguration.class })
@MapperScan("com.future.api.**.dao")
public class MybatisConfiguration implements EnvironmentAware {

	private static Log logger = LogFactory.getLog(MybatisConfiguration.class);

	private RelaxedPropertyResolver propertyResolver;

	@Inject
	private DataSource dataSource;

	@Override
	public void setEnvironment(Environment environment) {
		this.propertyResolver = new RelaxedPropertyResolver(environment,
				"mybatis.");
	}

	@Bean
	@ConditionalOnMissingBean
	public SqlSessionFactory sqlSessionFactory() {
		try {
			SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
			sessionFactory.setDataSource(dataSource);
			sessionFactory.setTypeAliasesPackage(propertyResolver
					.getProperty("typeAliasesPackage"));
			//if the mapper type is java class , this config is not necessary
			/*sessionFactory
					.setMapperLocations(new PathMatchingResourcePatternResolver()
							.getResources(propertyResolver
									.getProperty("mapperLocations")));*/
			sessionFactory
					.setConfigLocation(new DefaultResourceLoader()
							.getResource(propertyResolver
									.getProperty("configLocation")));

			return sessionFactory.getObject();
		} catch (Exception e) {
			logger.error("Could not confiure mybatis session factory");
			return null;
		}
	}

	@Bean
	@ConditionalOnMissingBean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}
