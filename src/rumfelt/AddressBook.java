package rumfelt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook {
	
	
	Scanner sc = new Scanner(System.in);
	List<BaseContact> contacts = new ArrayList<>();
	
	
	public void start() {
		
		contacts = DataServices.read();
		
//		DataAccessService p = new DataAccessService();
//		contacts.addAll(p.manualPersonalEntry());
//		contacts.addAll(p.manualBusinessEntry());
		menu();
		
	}
	public void menu() {
		
		System.out.println("Main Menu");
		System.out.println("================");
		System.out.println("1) Add a Personal Contact");
		System.out.println("2) Add a Business Contact");
		System.out.println("3) Show all Contacts");
		System.out.println("4) NR*Show Details of One Contact*NR");
		System.out.println("5) Remove a Contact");
		System.out.println("6) Update a Person Contact");
		System.out.println("7) Update a Business Contact");
		System.out.println("8) Sort Contacts");
		System.out.println("9) Search for a Contact by Name");
		System.out.println("10) Exit");
		System.out.println("================");
		System.out.println("Which option would you like?");
		int option = sc.nextInt();
		sc.nextLine();
		branch(option);
		menu();
		
		
	}
	
	private void branch(int option) {
		switch(option) {
		case 1:
			System.out.println("1) Add a Personal Contact");
			addPersonalContact();
			break;
		case 2:
			System.out.println("2) Add a Business Contact");
			addBusinessContact();
			break;
		case 3:
			System.out.println("3) Show all Contacts");
			showAll();
			break;
		case 4:
			System.out.println("4) Show Details of One Contact ");
			break;
		case 5:
			System.out.println("5) Remove a Contact");
			remove();
			break;
		case 6:
			System.out.println("6) Update Personal Contact");
			updatePersonContact();
			break;
		case 7:
			System.out.println("7) Update Business Contact");
			updateBusinessContacts();
			break;
		case 8:
			System.out.println("8) Sort by Name of Contact");
			sortByName();
			break;
		case 9:
			System.out.println("9) Search for a Contact by Name");
			search();
			break;
		case 10:
			System.out.println("10) Exit");
			DataServices.write(contacts);
			System.exit(0);
			break;
		default:
			return;
		
			
		}
	}
	
	private void sortByName() {
		CompareContactNames ab = new CompareContactNames();
		contacts.sort(ab);
		showAll();
		
	}
	
	public void showAll() {
		System.out.println("All Contacts");
		System.out.println("=================");
		for (int i=0; i < contacts.size(); i++) {
			System.out.println(contacts.get(i));
		}
		
	}
	
	private void updatePersonContact() {
		showAll();
		System.out.println("Which Person Contact to Update?: ");
		System.out.println("Enter a Number starting from top to buttom 1+ ");
		int item = sc.nextInt();
		sc.nextLine();
		if(contacts.get(item) instanceof Person) {
			System.out.println("Update a Person");
			updatePerson(item);
						
		}
	}
	
	private void updatePerson(int item) {
		System.out.println("Update a Person: ");
		System.out.println("=====================");
		System.out.println("Update a Name: [ " + contacts.get(item).getName());
		String name = sc.nextLine();
		contacts.get(item).setName(name);
		System.out.println("Update Personal Description: [ " + contacts.get(item).getDescription());
		String description = sc.nextLine();
		contacts.get(item).setDescription(description);
		System.out.println("Update the Phone Number: [ " + contacts.get(item).getPhone());
		int phone = sc.nextInt();
		sc.nextLine();
		contacts.get(item).setPhone(phone);
		System.out.println("Update a Hobby: [ " + ((Person) contacts.get(item)).getHobby());
		String hobby = sc.nextLine();
		((Person)contacts.get(item)).setHobby(hobby);
		System.out.println("Update Age [ " + ((Person) contacts.get(item)).getAge());
		int age = sc.nextInt();
		sc.nextLine();
		((Person)contacts.get(item)).setAge(age);
		System.out.println("Update Marital Status: [ " + ((Person) contacts.get(item)).getMaritalStatus());
		String maritalStatus = sc.nextLine();
		((Person)contacts.get(item)).setMaritalStatus(maritalStatus);
		System.out.println("Update Number in Household: [ " + ((Person) contacts.get(item)).getNumberInHousehold( ));
		int numberInHousehold = sc.nextInt();
		sc.nextLine();
		((Person)contacts.get(item)).setNumberInHousehold(numberInHousehold);
		System.out.println("==========================");
		System.out.println("Would you like to Update a Photo? [Y / N]");
		String option = sc.nextLine();
		if (option.equals("Y")) {
			System.out.println("Enter Photo Name:");
			String photoName = sc.nextLine();
			System.out.println("Enter Date: ");
			int date = sc.nextInt();
			sc.nextLine();
			((Person)contacts.get(item)).setPhoto(new Photo (photoName, date));
		}
		
		
		
	}
	
	private void updateBusinessContacts() {
		showAll();
		System.out.println("Which Business Contact to Update?: ");
		System.out.println("Enter a Number starting from top to buttom 1+ ");
		int item = sc.nextInt();
		sc.nextLine();
		if(contacts.get(item) instanceof BusinessContact) {
			System.out.println("Update a Business");
			updateBusinessContact(item);
						
		}
	}
	private void updateBusinessContact(int item) {
		// TODO Auto-generated method stub
		System.out.println("Update a Business: ");
		System.out.println("=====================");
		System.out.println("Update a Name: [ " + contacts.get(item).getName());
		String name = sc.nextLine();
		contacts.get(item).setName(name);
		System.out.println("Update Business Description: [ " + contacts.get(item).getDescription());
		String description = sc.nextLine();
		contacts.get(item).setDescription(description);
		System.out.println("Update Business Phone Number: [ " + contacts.get(item).getPhone());
		int phone = sc.nextInt();
		sc.nextLine();
		contacts.get(item).setPhone(phone);
		System.out.println("Update Hours : [ " + ((BusinessContact) contacts.get(item)).getHours());
		int hours = sc.nextInt();
		sc.nextLine();
		((BusinessContact)contacts.get(item)).setHours(hours);
		System.out.println("Update URL: [ " + ((BusinessContact) contacts.get(item)).getUrl());
		String url = sc.nextLine();
		((BusinessContact)contacts.get(item)).setUrl(url);
		System.out.println("Update Years in Business : [ " + ((BusinessContact) contacts.get(item)).getYears());
		int years = sc.nextInt();
		sc.nextLine();
		((BusinessContact)contacts.get(item)).setYears(years);;
		System.out.println("Would you like Update a Business Address Location? [ Y / N ]");
		String option = sc.nextLine();
		if (option.equals("Y")) {
			System.out.println("Enter Street Name: ");
			String street = sc.nextLine();
			System.out.println("Enter Street Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter State: ");
			String state = sc.nextLine();
			System.out.println("Enter Zip Code: ");
			int zip = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Business City: ");
			String city = sc.nextLine();
			 ((BusinessContact)contacts.get(item)).setLocation(new Location (street, number, state, zip, city));
		}
	}
	
	
	
	
	
	
	public void remove() {
		showAll();
		System.out.println("Remove a Contact: ");
		System.out.println("/n");
		System.out.println("Enter a Number starting from top to buttom 1+ ");
		int item = sc.nextInt();
		sc.nextLine();
		contacts.remove(item);
	}
	
	private void search() {
		System.out.println("Search for Contact by Name: ");
		System.out.println("===============================");
		System.out.println("Enter Name");
		String s = sc.nextLine();
		for(int i = 0; i < contacts.size(); i++ ) {
			if(contacts.get(i).getName().toLowerCase().contains(s.toLowerCase()))
				System.out.println(i + ")" + contacts.get(i));
		}
	}
	
	
	public void addPersonalContact() {
		System.out.println("");
		System.out.println("==========================");
		System.out.println("Add Persons Name");
		String name = sc.nextLine();
		System.out.println("Add a Personal Description");
		String description = sc.nextLine();
		System.out.println("Add a Phone Number:");
		int phone = sc.nextInt();
		sc.nextLine();
		System.out.println("Add a Hobby");
		String hobby = sc.nextLine();
		System.out.println("Add Age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Add Marital Status");
		String maritalStatus = sc.nextLine();
		System.out.println("Enter Number in Household");
		int numberInHousehold = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Would you like to add a Photo? [Y / N]");
		String option = sc.nextLine();
		Photo p = null;
		if (option.equals("Y")) {
			System.out.println("Enter Photo Name:");
			String photoName = sc.nextLine();
			System.out.println("Enter Date: ");
			int date = sc.nextInt();
			sc.nextLine();
			p = new Photo(photoName, date);
			
		}
		
		contacts.add(new Person(name, description, phone, hobby, age, maritalStatus, numberInHousehold, p));
	}
	
	public void addBusinessContact() {
		System.out.println("");
		System.out.println("==========================");
		System.out.println("Add Business Name");
		String name = sc.nextLine();
		System.out.println("Add a Business Description");
		String description = sc.nextLine();
		System.out.println("Add a Business Phone Number:");
		int phone = sc.nextInt();
		sc.nextLine();
		System.out.println("Add Business Openning Hours: [ hh ]");
		int hours = sc.nextInt();
		sc.nextLine();
		System.out.println("Add Business URL: ");
		String url = sc.nextLine();
		System.out.println("Add Years in Business: ");
		int years = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Would you like to add a Business Address Location? [ Y / N ]");
		String option = sc.nextLine();
		Location l = null;
		if (option.equals("Y")) {
			System.out.println("Enter Street Name: ");
			String street = sc.nextLine();
			System.out.println("Enter Street Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter State: ");
			String state = sc.nextLine();
			System.out.println("Enter Zip Code: ");
			int zip = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Business City: ");
			String city = sc.nextLine();
			l = new Location(street, number, state, zip, city);
					
		}
		contacts.add(new BusinessContact(name, description, phone, hours, url, years, l));
		
	}


}
