package com.JavaBean;

public class Person {
	private int age;
	
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
			
			System.out.println("AGE initialized");
		}
		else {
			System.out.println("invalid age");
		}
	}
	public int getAge() {
		return age;
	}

}
