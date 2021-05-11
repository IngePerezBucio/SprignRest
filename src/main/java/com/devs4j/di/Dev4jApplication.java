package com.devs4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.devs4j.di.lifeCycle.ExplicitBean;
import com.devs4j.di.lifeCycle.LifeCycleBean;

import ch.qos.logback.core.spi.LifeCycle;

@SpringBootApplication
public class Dev4jApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(Dev4jApplication.class);

	
	@Bean
	public String getApplicationName() {
		return ":Devs4j rules";
	}
	/*
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ExplicitBean getBean() {
		return new ExplicitBean();
	}
	*/
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Dev4jApplication.class, args);
		LifeCycleBean bean = context.getBean(LifeCycleBean.class);
	}

}
