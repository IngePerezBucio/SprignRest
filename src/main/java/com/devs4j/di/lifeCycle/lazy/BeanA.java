package com.devs4j.di.lifeCycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class BeanA {
	
	private static final Logger log = LoggerFactory.getLogger(BeanB.class);

	public void init() {
		log.info("Init Bean A");
	}
}
