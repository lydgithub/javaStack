package cn.beijing;

import java.util.Date;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;

public class TestGit {
	
	private static final String sf_str=null;//静态常量(必须要初始化)
	
	private String str;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static  String tt=null;//静态变量的声明必须在成员方法外部。
		
		System.out.println("hello"+new Date());
		System.out.println("use develop brunch");
		
		String str="java";
		System.out.println(str.length());
		
		char[] zf={'j','a','v','a'};
		System.out.println(zf.length);
		
		String[] zfc={"j","a","va"};
		System.out.println(zfc.length);
		
	}

}
