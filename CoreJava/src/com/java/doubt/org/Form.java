package com.java.doubt.org;
import java.util.Scanner;
public class Form {
	
	String name,collegeName,branch;
	long contactNo;
	
	public Form() {
		
	}
	
	public Form(String name, String collegeName, String branch, long contactNo) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.branch = branch;
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	final public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getContactNo() {
		return contactNo;
		
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Form obj = new Form();
		System.out.println("Enter Name");
		obj.setName(sc.next());
		System.out.println("Enter Branch");
		obj.setBranch(sc.next());
		System.out.println("Enter College Name");
		obj.setCollegeName(sc.next());
		System.out.println("Enter contact No");
		obj.setContactNo(sc.nextLong());
		System.out.println("Student Details are");
		System.out.println("Student Name:"+obj.getName());
		System.out.println("Student Branch:"+obj.getBranch());
		System.out.println("Student Contact No"+obj.getContactNo());
		System.out.println("Student College Name:"+obj.getCollegeName());
		sc.close();
	}
}
