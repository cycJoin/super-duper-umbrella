package com.cn.base.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.cn.base"})
@EnableScheduling
public class Application {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
