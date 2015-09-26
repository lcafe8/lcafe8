package com.lcafe8.annotation;

public @interface AnnotatianTest
{
	String value() default "Hello";
	EnumTest value2();
}

enum EnumTest
{
	Hello,World,Welcome;
}