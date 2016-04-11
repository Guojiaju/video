package com.future.config.mybatis;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.future.api.**.dao")
public class DataBaseConfiguration implements EnvironmentAware {


	private RelaxedPropertyResolver propertyResolver;

	private static Logger log = LoggerFactory.getLogger(DataBaseConfiguration.class);

	@Override
	public void setEnvironment(Environment env) {
		this.propertyResolver = new RelaxedPropertyResolver(env, "dataSource.");
	}

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		log.debug("Configuring DataSource");

		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl(propertyResolver.getProperty("url"));
		druidDataSource.setDriverClassName(propertyResolver.getProperty("dataSourceClassName"));
		druidDataSource.setUsername(propertyResolver.getProperty("username"));
		druidDataSource.setPassword(propertyResolver.getProperty("password"));
		return druidDataSource;
	}
}

