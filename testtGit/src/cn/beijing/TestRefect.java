package cn.beijing;

import java.lang.reflect.Field;


public class TestRefect {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		/*
		User user=new User();
		user.name="jack";
		
		System.out.println(user.name);
		*/
		

		//get the class
			Class c1=Class.forName("cn.beijing.User");
		//get the attribute	
			Field idF=c1.getDeclaredField("name");
			
		//实例化
			Object obj=c1.newInstance();
		//打破封装
			idF.setAccessible(true);
		//赋值	
			idF.set(obj, "jack");
		//取值	
			System.out.println(idF.get(obj));

	}

}
