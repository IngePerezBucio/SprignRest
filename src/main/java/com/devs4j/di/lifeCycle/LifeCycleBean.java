/**
 * 
 */
package com.devs4j.di.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author jpr6a
 *
 */

@Component
@Lazy
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean{
	
	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);
	
	/*
	 * Durante la construccion de bean "BeanNameAware"
	 */
	
	@Override
	public void setBeanName(String name) {
		log.info("Bean name {}",name);
	}
	
	/**
	 * Esto se ejecutara despues de la carga de la dependencia.
	 */
	
	@PostConstruct
	public void init() {
		log.info("Post construct");
	}
	
	/**
	 * Esto se ejecutara antes de que el bean sea destruido
	 * No se ejecutan en beans prototype
	 * Solo se ejecutan durante una terminación de la VM de forma normal
	 */
	@PreDestroy
	public void destroyBean() {
		log.info("Pre destroy");
	}
 
	
	@Override
	public void destroy() throws Exception{
		log.info("Destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		log.info("After properties set method");
		
	}
	
}
