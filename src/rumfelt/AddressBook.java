package rumfelt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook {


	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		System.out.println("Main Menu");
		System.out.println("================");
		System.out.println("1) Add a Personal Contact");
		System.out.println("2) Add a Business Contact");
		System.out.println("3) Show all Contacts");
		System.out.println("4) Show Details of One Contact");
		System.out.println("5) Remove a Contact");
		System.out.println("6) Update a Contact");
		System.out.println("7) Sort Contacts");
		System.out.println("8) Search for a Contact by Name");
		System.out.println("9) Exit");
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
			break;
		case 2:
			System.out.println("2) Add a Business Contact");
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
			break;
		case 6:
			System.out.println("6) Update a Contact");
			break;
		case 7:
			System.out.println("7) Sort Contacts");
			break;
		case 8:
			System.out.println("8) Search for a Contact by Name");
			break;
		case 9:
			System.out.println("9) Exit");
			break;
		default:
			return;
		
			
		}
	}
	
	public void showAll() {
		DataAccessService d = new DataAccessService();
		DataAccessService b = new DataAccessService();
//		d.personal.size();
//		b.business.size();
		System.out.println("All Contacts");
		System.out.println("=================");
		System.out.println(d);
		System.out.println(b);
		
				
		
		
	}


}
