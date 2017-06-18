package cn.shanghai;

import cn.beijing.User;

public class Producter {
	public static void main(String[] args) {
		User user=new User();
		
		user.area="Shanghai";//只能访问public 的属性
		
	}
}
