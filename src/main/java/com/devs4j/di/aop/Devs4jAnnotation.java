/**
 * 
 */
package com.devs4j.di.aop;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
/**
 * @author jpr6a
 *
 */
public @interface Devs4jAnnotation {

}
