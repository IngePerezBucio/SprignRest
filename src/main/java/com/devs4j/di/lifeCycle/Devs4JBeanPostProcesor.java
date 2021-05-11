/**
 * 
 */
package com.devs4j.di.lifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author jpr6a
 *
 */

@Component
public class Devs4JBeanPostProcesor implements BeanPostProcessor {

	private static final Logger log = LoggerFactory.getLogger(Devs4JBeanPostProcesor.class);

	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (bean instanceof LifeCycleBean) {
			log.info("Before init bean {}",beanName);
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (bean instanceof LifeCycleBean) {
			log.info("After init bean {}",beanName);
		}
		return bean;
	}

}
