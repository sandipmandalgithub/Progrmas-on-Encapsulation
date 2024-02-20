package com.JavaBean;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		
		System.out.println("ID :"+e.getId());
		System.out.println("NAME :"+e.getName());
		System.out.println("SALARY :"+e.getSalary());
	
		
		
		
		
		
	}

}
