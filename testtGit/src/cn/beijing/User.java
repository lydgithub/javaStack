package cn.beijing;

public class User {

	private int age;//只有在类内可以访问
	String name="Jack";//同一包内的都可以访问,不在同一包内的子类不能访问
	protected char sex;//同一包内得都可以访问,子类可以访问
	public String area;//都可以访问

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
