package com.generic;

public class Human {
	//Example of method overloading
	public void getSalary() {
		System.out.println("Hello");
	}
	
	public String getSalary(String a) {
		System.out.println("Hello");
		return a;
	}
	
	
	public void getSalary(int a) {
		//code
	}
	

	public void getSalary(int a, int b) {
		//code
	}
	
	public void getSalary(int a, int b, String c) {
		//code
	}
	
	public void getSalary(String a, int b, String c) {
		//code
	}
	
	public void getSalary(String a, double b, boolean c) {
		//code
	}
	
	public void getSalary(String a, boolean c, double b) {
		//code
	}

public static void main(String[] args) {
	Human obj = new Human();
	obj.getSalary();
}	
	
}
