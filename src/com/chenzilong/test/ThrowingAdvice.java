package com.chenzilong.test;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class ThrowingAdvice{

	Logger logger=Logger.getLogger(this.getClass().getName());
	@AfterThrowing("execution( * com.chenzilong.test.UserDao.*(..))")
	public void afterThrowing(){
		logger.log(Level.INFO, "exception &&&&&&&&&");
	}
}
