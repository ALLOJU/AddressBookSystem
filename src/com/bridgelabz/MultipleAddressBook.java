package com.bridgelabz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MultipleAddressBook {
	Scanner sc=new Scanner(System.in);	
	//hashmap used to save address book details
	HashMap<String,AddressBook> addrMap=new HashMap<>();

	public void addAddressBook()
	{
		System.out.println("Enter address book name");
		String addrbookName=sc.next();
		if(addrMap.containsKey(addrbookName)) {
			System.out.println("Address Book Name already exist,please enter another one");
		}
		else {
			AddressBook ab=new AddressBook();
			//Adding addressbook name and contacts details to Hashmap
			addrMap.put(addrbookName, ab);
			System.out.println("Address book "+addrbookName+"   Added Successfully");
		}
	}
	//To add person details to Address book
	public void addPersonInBook() {
		System.out.println("Enter name of address book to add person details");
		String addbookname=sc.next();
		// To get address book
		AddressBook ab=addrMap.get(addbookname);
		if(ab==null) {
			System.out.println("No address book found");
		}
		else {
			addrMap.get(addbookname).addPerson();
		}
	}

	//To edit person details in address book
	public void EditPersonInBook() {
		System.out.println("Enter Name of the Book To Edit");
		String editbookName=sc.next();
		//AddressBook aBook=addrMap.get(editbookName);
		if(addrMap.containsKey(editbookName))
		{
			addrMap.get(editbookName).editPerson();
		}
		else {
			System.out.println("Address Book does not exist,Please enter new one");
			EditPersonInBook();
		}

	}
	//to delete person details in Address Book
	public void DeletePersonInBook() {
		System.out.println("Enter Name of the Book To Delete");
		String deleteBook=sc.next();
		if(addrMap.containsKey(deleteBook)) {
			addrMap.get(deleteBook).deletePerson();
		}
		else {
			System.out.println("Address Book does not exist,Please enter new one");
			DeletePersonInBook();
		}

	}
	//Method to Display address book
	public void displayAddressBook() {
		for(String i:addrMap.keySet())
		{
			System.out.println(i);
		}
	}
	//Method to Display Person details in address Book
	public void displayPersonsInAddressBook() {
	
		 for(String i:addrMap.keySet()) { System.out.println(i);
		  System.out.println(addrMap.get(i).persons); 
		  }
		       
	}
	


public static void main(String[] args) {
	MultipleAddressBook multiaddrbook=new MultipleAddressBook();
	int num;
	//multiaddrbook.addAddressBook();
	do {
		System.out.println("Please Enter 1 to add Address Book");
		System.out.println("Please Enter 2 to add person details in Address Book");
		System.out.println("Please Enter 3 to Edit person details in Address Book");
		System.out.println("Please Enter 4 to Delete person details in Address Book");
		System.out.println("Please Enter 5 to Display Address Book");


		System.out.println("Choose option to perform action");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		switch(num) {
		case 1:
			System.out.println("Enter no of Address books to Add");
			int addressbooks=sc.nextInt();
			for(int i=1;i<=addressbooks;i++) {



				multiaddrbook.addAddressBook();
			}
			multiaddrbook.displayAddressBook();

			break;
		case 2:

			System.out.println("Enter no of persons");
			int persons=sc.nextInt();
			for(int i=1;i<=persons;i++) {
				multiaddrbook.addPersonInBook();
			}
			multiaddrbook.displayPersonsInAddressBook();

			break;
		case 3:
			
			multiaddrbook.EditPersonInBook();
			multiaddrbook.displayPersonsInAddressBook();
			break;
		case 4:
			
			multiaddrbook.DeletePersonInBook();
			multiaddrbook.displayPersonsInAddressBook();

			break;

		}

	}while(num!=0);
}
}

