package com.devs4j.di.lifeCycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanB {
	
	@Autowired
	private BeanA beanA;
	private static final Logger log = LoggerFactory.getLogger(BeanB.class);

	public void init() {
		log.info("Init Bean B");
	}
	
}
