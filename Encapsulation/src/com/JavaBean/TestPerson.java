package com.JavaBean;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		Person p=new Person();
		p.setAge(age);
		System.out.println("Age:"+p.getAge());
		

	}

}
