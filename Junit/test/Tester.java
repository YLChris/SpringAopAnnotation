package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chenzilong.test.UserDao;

public class Tester {

	@Test
	public void testAOP_API() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
		UserDao user = (UserDao) ac.getBean("userdao");
		user.delete("Jary");
	}
}
