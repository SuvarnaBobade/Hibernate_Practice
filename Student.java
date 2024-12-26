package com.pojo;

public class Student {
	private String stud_name;
	private int roll_number;
	private String address;
	private int age;
	private String gender;

	public Student() {
		super();
	}

	public Student(String stud_name, int roll_number, String address, int age, String gender) {
		super();
		this.stud_name = stud_name;
		this.roll_number = roll_number;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [stud_name=" + stud_name + ", roll_number=" + roll_number + ", address=" + address + ", age="
				+ age + ", gender=" + gender + "]";
	}
}