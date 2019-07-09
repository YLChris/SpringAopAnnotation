package com.chenzilong.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAfterAdvice {

	Logger logger = Logger.getLogger(this.getClass().getName());
	@AfterReturning("execution( * com.chenzilong.test.UserDao.*(..))")
	public void afterReturn() {
		logger.log(Level.INFO,"after delete>>>>>>>>");
	}

}
