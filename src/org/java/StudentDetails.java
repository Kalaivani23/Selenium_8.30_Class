package org.java;

public class StudentDetails {
	public void stuId() {
		System.out.println("Stu Id");
	}

	public void stuName() {
		System.out.println("Stu Name");
	}

	public void stuPhone() {
		System.out.println("Stu Phone");
	}

	public void stuAddress() {
		System.out.println("Stu Address");
	}

	public static void main(String[] args) {
		System.out.println("Hi");
		StudentDetails stu = new StudentDetails();
		stu.stuAddress();
	}

}
