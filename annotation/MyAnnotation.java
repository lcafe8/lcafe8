package com.lcafe8.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation
{
	String Hello() default "beijing";
	String World();
}
