package com.future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 * @author Eric.guo
 * @date 2016/3/22 0022
 */
@SpringBootApplication
public class Application{

    private final static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception{
        log.info("startup application");
        SpringApplication.run(Application.class,args);
    }
}
