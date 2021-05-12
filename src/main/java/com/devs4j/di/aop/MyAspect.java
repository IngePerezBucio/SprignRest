package com.devs4j.di.aop;



import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(0)
@Aspect
@Component
public class MyAspect {
	
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint joinpoint) {
		log.info("1 Method name {}",joinpoint.getSignature().getName());
		log.info("1 Object type {}",joinpoint.getSignature().getDeclaringTypeName());
		log.info("1 Modifiers {}",joinpoint.getSignature().getModifiers());
		log.info("1 Arguments {}",joinpoint.getArgs());
		log.info("1 Is public {}",Modifier.isPublic(joinpoint.getSignature().getModifiers()));
		log.info("Before advice");
	}
}
