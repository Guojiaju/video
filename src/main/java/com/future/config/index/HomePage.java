package com.future.config.index;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * HomePage
 *
 * @author Eric.guo
 * @date 2016/4/25 0025 16:49
 */
@Configuration
public class HomePage extends WebMvcConfigurerAdapter {

    //Config the project homepage
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/scripts/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
