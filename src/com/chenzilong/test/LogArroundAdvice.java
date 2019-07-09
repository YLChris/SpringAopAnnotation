package com.chenzilong.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class LogArroundAdvice{
	Logger logger=Logger.getLogger(this.getClass().getName());
	@Around("execution( * com.chenzilong.test.UserDao.*(..))")
	public void invoke(ProceedingJoinPoint prj) throws Throwable{
		logger.log(Level.INFO,"before delete.....");
		prj.proceed();
		logger.log(Level.INFO, "after delete.....");
	}

}
