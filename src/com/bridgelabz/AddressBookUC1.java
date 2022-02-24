package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mounika
 *
 */
public class AddressBook {


	//Creating arraylist object
	ArrayList<Persons> persons;

	//created constructor
	public AddressBook() {
		persons=new ArrayList<Persons>();

	}




	//to display ArrayList Content
	public void display() {
		for (Persons person : persons)

			System.out.println("Person details " + person.getFirst_name() +"\t" +person.getLast_name()+"\t"+person.getAddress()+"\t" 
					+person.getCity()+"\t"+person.getState()+ "\t"+person.getZip()+"\t"+person.getPhone_number()+"\t"+person.getEmail());

	}
	//method to add person details to array list
	public void addPerson() {
		//creating Scanner object to get input from user
		Scanner sc=new Scanner(System.in);
		//taking input from user using scanner object
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
	//Method to edit person details from array list
	private void editPerson(String n) {
	
		for(int i=0;i<persons.size();i++) {
			Persons p=(Persons)persons.get(i);
			System.out.println("person details are");
			if(n.equalsIgnoreCase(p.getFirst_name()))
			{
				Scanner sc=new Scanner(System.in);


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


				p.setLast_name(last_name);
				p.setAddress(address);
				p.setCity(city);
				p.setState(state);
				p.setZip(zip);
				p.setPhone_number(phone_number);
				p.setEmail(email);
			}
		}
	}
	//Method to delete values from arraylist
	private void deletePerson(String fname) {
		
		for(int i=0;i<persons.size();i++) {
			Persons p=(Persons)persons.get(i);
			System.out.println("person details are");
			if(fname.equals(p.getFirst_name()))
			{
				persons.remove(i);
				System.out.println("Record deleted successfully");
			}
		}


	}

	public static void main(String[] args) {

		AddressBook ab=new AddressBook();
		int num;
		do {
			
		
		
		System.out.println("Please Enter 1 to add person details");
		System.out.println("Please Enter 2 to edit person details");
		System.out.println("Please Enter 3 to delete person details");
		System.out.println("Choose option to perform action");
		Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		
			switch(num) {
			case 1:
			
				ab.addPerson();
				
				ab.display();
		
				break;
				
			case 2:
				System.out.println("Enter name to Edit");
				String name=sc.next();
				ab.editPerson(name);
				ab.display();
				break;
			case 3:
				System.out.println("Enter Name to Delete ");
				String fname=sc.next();
				ab.deletePerson(fname);
				ab.display();
				break;
				
			}
			

	}while(num!=0);
	}
}
