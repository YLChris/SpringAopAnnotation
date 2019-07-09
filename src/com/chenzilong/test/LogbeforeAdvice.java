package com.chenzilong.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LogbeforeAdvice{
	Logger logger = Logger.getLogger(this.getClass().getName());
	//这里的。。是代表方法参数不限,代表UserDao下的所有方法执行前都要进行before拦截
	@Before("execution( * com.chenzilong.test.UserDao.*(..))")
	public void before() {
		logger.log(Level.INFO, "before delete>>>>>>");
	}

}
