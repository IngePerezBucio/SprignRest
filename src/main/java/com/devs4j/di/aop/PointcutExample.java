/**
 * 
 */
package com.devs4j.di.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author jpr6a
 *
 */
public class PointcutExample {
	
	
	//@Pointcut("execution(* com.devs4j.di.aop.TargetObject.*(..))")
	/**
	 * Todos los metodos que esten dentro este paquete van a hacer target
	 * Object y seran aspectos
	 * @Pointcut("within(com.devs4j.di.aop.*")
	 * Sobre todos los metodos de esta clase
	 * @Pointcut("within(com.devs4j.di.aop.TargetObject")
	 * Sobre todos los metodos que se encuentren en el mismo paquete y subpaquetes
	 * @Pointcut("within(com.devs4j.di.aop..*")
	 * Solo sobre todos los metodos de una clase que se encuentre en el mismo paquete
	 * @Pointcut("within(TargetObject)")
	 * Solamente sobre las clases que implementen la interfaz TargetObject
	 * @Pointcut("within(TargetObject+)")
	 * Solamente a los metodos que contengan esta anotacion
	 * +@Pointcut("@annotation(Devs4jAnnotation)")
	 */
	//@Pointcut("within(TargetObject)")
	@Pointcut("@annotation(Devs4jAnnotation)")
	public void targetObjectMethods() {
		
	}
}
