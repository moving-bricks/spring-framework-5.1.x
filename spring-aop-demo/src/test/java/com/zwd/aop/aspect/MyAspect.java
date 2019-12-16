package com.zwd.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Before("execution(* say(..))")// the pointcut expression
	private void anyOldTransfer() {
		System.out.println("上课铃响了");
	}
}
