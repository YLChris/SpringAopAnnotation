package com.chenzilong.test;

public class UserDaoImplement implements UserDao{

	@Override
	public void delete(String name) {
		/*String st=null;
		st.length();//此处是为了测试ThrowAdvice
*/		System.out.println("删除成功！！");
	}

}
