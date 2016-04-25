package com.future;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Application
 * @author Eric.guo
 * @date 2016/3/22 0022
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application{

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }
}
