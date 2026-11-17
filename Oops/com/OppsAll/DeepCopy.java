package com.OppsAll;

public class DeepCopy {

	int id;
	String name;
	String branch;
	private String city;

	public DeepCopy(int id, String name, String branch,String city) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.city=city;
	}
	
	public DeepCopy(String string) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.city=city;
	}
	
	class Address {
		String city;
		
	}

	void details() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Branch : " + branch);
		System.out.println("Address : " + city);
		System.out.println("*******************************");
	}

	public static void main(String[] args) {
		DeepCopy d = new DeepCopy(1, "Madhu", "CSE","Kurnool");
		d.details();
//		DeepCopy d1 = new DeepCopy("Andhra");
//	d1.details();
	}

}
