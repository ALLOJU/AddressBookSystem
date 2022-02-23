package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mounika
 *
 */
public class AddressBookUC1 {



	ArrayList<Persons> persons;

	public AddressBookUC1() {
		persons=new ArrayList<Persons>();

	}

	/*
	 * //add new person record to arraylist after taking input public void
	 * addPerson() { //taking input from user with Scanner Object Scanner sc=new
	 * Scanner(System.in); System.out.println("Enter first name"); String
	 * first_name=sc.next(); System.out.println("Enter Last name"); String
	 * last_name=sc.next(); System.out.println("Enter Address"); String
	 * address=sc.next(); System.out.println("Enter City"); String city=sc.next();
	 * System.out.println("Enter State"); String state=sc.next();
	 * System.out.println("Enter Zip"); String zip=sc.next();
	 * System.out.println("Enter Phone Number"); int phone_number=sc.nextInt();
	 * System.out.println("Enter Email"); String email=sc.next(); //Conctruct new
	 * person object Persons p=new
	 * Persons(first_name,last_name,address,city,state,zip,phone_number,email);
	 * //add the above person object to Arraylist persons.add(p); }
	 */
	//to display ArrayList Content
	public void display() {
		for (Persons person : persons)

			System.out.println("Person details " + person);

	}
	public void addPerson(Persons p) {
		boolean isInList=false;
		for(Persons per : persons){
			if(per.getFirst_name().equals(p.getFirst_name())&&per.getLast_name().equals(p.getLast_name())){
				System.out.printf("could not add person");
				isInList=true;
			}
		}
		if(!isInList){
			this.persons.add(p);
		}
	}
	public static void main(String[] args) {
		AddressBookUC1 ab=new AddressBookUC1();

		/*
		 * ArrayList<Persons> persons; persons.add(p);
		 */
		Persons p=new Persons();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Name");
		String first_name=sc.next();
		p.setFirst_name(first_name);

		System.out.println("Enter Last Name");
		String last_name=sc.next();
		p.setFirst_name(first_name);
		p.setLast_name(last_name);
		
		
		System.out.println("Enter Address");
		String address=sc.next();
		p.setAddress(address);
		
		System.out.println("Enter City");
		String city=sc.next();
		p.setCity(city);
		
		System.out.println("Enter State");
		String state=sc.next();
		p.setState(state);
		
		System.out.println("Enter Zip code");
		String zip=sc.next();
		p.setZip(zip);
		
		System.out.println("Enter Phone Number");
		int phone_number=sc.nextInt();
		p.setPhone_number(phone_number);
		
		System.out.println("Enter email");
		String email=sc.next();
		p.setEmail(email);

		
		ab.addPerson(p);
		ab.display();

	}


}
