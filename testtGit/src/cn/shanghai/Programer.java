package cn.shanghai;

import cn.beijing.User;

public class Programer extends User{


	public static void main(String[] args) {
		 Programer programer=new Programer();
		 programer.sex='M';//protected 的属性可以访问
		 //programer.name="Jack";//default 的属性访问不到
	}
}
