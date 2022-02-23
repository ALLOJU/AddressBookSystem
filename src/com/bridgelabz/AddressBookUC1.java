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




	//to display ArrayList Content
	public void display() {
		for (Persons person : persons)

			System.out.println("Person details " + person.getFirst_name() +"\t" +person.getLast_name()+"\t"+person.getAddress()+"\t" 
					+person.getCity()+"\t"+person.getState()+ "\t"+person.getZip()+"\t"+person.getPhone_number()+"\t"+person.getEmail());

	}
	public void addPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String first_name=sc.next();


		System.out.println("Enter Last Name");
		String last_name=sc.next();

		System.out.println("Enter Address");
		String address=sc.next();
		
		System.out.println("Enter City");
		String city=sc.next();

		System.out.println("Enter State");
		String state=sc.next();

		System.out.println("Enter Zip code");
		String zip=sc.next();

		System.out.println("Enter Phone Number");
		int phone_number=sc.nextInt();

		System.out.println("Enter email");
		String email=sc.next();

		Persons p=new Persons(first_name,last_name,address,city,state,zip,phone_number,email);
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

		System.out.println("Choose option to perform action");
		System.out.println("Enter 1 to add person details");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		char choice;
		do {
			switch(num) {
			case 1:

				ab.addPerson();
				ab.display();
				break;
		
			
			}
			System.out.println("Do You Want To Continue(Y/N)");
			choice = sc.next().charAt(0);

		}
		while(choice == 'Y'|| choice == 'y');

	
	}
}

