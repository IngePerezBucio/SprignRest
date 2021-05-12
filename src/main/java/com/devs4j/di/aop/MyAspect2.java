/**
 * 
 */
package com.devs4j.di.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author jpr6a
 *
 */
@Order(1)
@Aspect
@Component
public class MyAspect2 {
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect2.class);

	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint joinpoint) {
		log.info("2 Method name {}",joinpoint.getSignature().getName());
		log.info("2 Object type {}",joinpoint.getSignature().getDeclaringTypeName());
		log.info("2 Modifiers {}",joinpoint.getSignature().getModifiers());
		log.info("2 Arguments {}",joinpoint.getArgs());
		log.info("2 Is public {}",Modifier.isPublic(joinpoint.getSignature().getModifiers()));
		log.info("Before advice");
	}
	
}
