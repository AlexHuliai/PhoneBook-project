package ProjectPhone;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Customer c1 = new Customer();
		Address a1 = new Address();
		c1.setFirstName("John");
		c1.setLastName("Doe");
		c1.setMiddleName("");
		c1.setPhoneNumber("6366435698");
		a1.setStreet("114 Market st");
		a1.setCity("St Louis");
		a1.setZipCode("63403");
		a1.setState("MO");
		c1.setAddress(a1);
		
		Customer c2 = new Customer();
		Address a2 = new Address();
		c2.setFirstName("John");
		c2.setLastName("Doe");
		c2.setMiddleName("E");
		c2.setPhoneNumber("8475390126");
		a2.setStreet("324 Main st");
		a2.setCity("St Charles");
		a2.setState("MO");
		a2.setZipCode("63303");
		c2.setAddress(a2);
		
		Customer c3 = new Customer();
		Address a3 = new Address();
		c3.setFirstName("John");
		c3.setLastName("Doe");
		c3.setMiddleName("Michael West");
		c3.setPhoneNumber("5628592375");
		a3.setStreet("574 Pole ave");
		a3.setCity("St Peters");
		a3.setState("MO");
		a3.setZipCode("63333");
		c3.setAddress(a3);
		
		Customer[] customers = {c1, c2, c3};
		
		Phonebook pb = new Phonebook(customers);
		
		int input = -1 ;
		
		
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		
			
			do {
				
				System.out.println("Console based phone book application by Oleksandr Huliai");
				System.out.println("Please choose from folowing functions :");
				System.out.println("1 - Search a contact by first name .");
				System.out.println("2 - Search a contact by last name .");
				System.out.println("3 - Search a contact by full name .");
				System.out.println("4 - Search a contact by telephone number .");
				System.out.println("5 - Search a contact by city .");
				System.out.println("6 - Search a contact by state .");
				System.out.println("7 - Delete a contact .");
				System.out.println("8 - Edit a contact .");
				System.out.println("9 - Add a contact");
				System.out.println("10 - Show list of all contacts.");
				System.out.println("0 - Exit the application .");
				
				
				input = Integer.parseInt(reader.readLine());
		 	
			switch (input) {
			
			case 1: 
				System.out.println("Please eneter the first name of customer you looking for :");	
				String s1 = reader.readLine();

				pb.searchByFirstName(s1);
				break;
				
			
			case 2:         
				System.out.println("Please enter last name of customer you are looking for :");
				String s2 = reader.readLine();
				
				pb.searchByLastName(s2);
				break;
			
			case 3:              
				System.out.println("Please enter full name of customer you are looking for :");
				String s3 = reader.readLine();
				
				pb.searchByFullName(s3);
				break;
				
			case 4:     
				System.out.println("Please enter phone number of customer you are looking for :");
				String s4 = reader.readLine();
				
				pb.searchByPhoneNumber(s4);
				break;
			
			case 5:  
				System.out.println("Please enter a city by which you trying to locate a customer :");
				String s5 = reader.readLine();
				
				pb.searchByCity(s5);
				break;
				
			case 6: 
				System.out.println("Please enter the state by which you are trying to locate a customer :");
				String s6 = reader.readLine();
				
				pb.searchByState(s6);
				break;
				
			case 7:  
				System.out.println("Please enter phonenumber of customer you want to delete :");              
				String s7 = reader.readLine();
				
				pb.deleteCustomer(s7);
				break;
			case 8:  
				System.out.println("Please enter for nuymber of user you would like to update");
				String s8 = reader.readLine();
				
				if(s8.equals(pb.checkCustomers(s8))) 
				{
					System.out.println("Record was found , please enter new First Name for the customer :");
					String s9 = reader.readLine();
					
					System.out.println("Please enter new middle name for the custoemr :");
					String s10 = reader.readLine();
					
					System.out.println("Please enter new last Name for the customer :");
					String s11 = reader.readLine();
					
					System.out.println("Please enter new street for the customer :");
					String s12 = reader.readLine();
					
					System.out.println("Please enter new city for the customer :");
					String s13 = reader.readLine();
					
					System.out.println("Please enter new state for the customer :");
					String s14 = reader.readLine();
					
					System.out.println("Please enter new zipcode for the customer :");
					String s15 = reader.readLine();
					
					pb.editCustomer(s8,s9, s10, s11, s12, s14, s13, s15);
					System.out.println("Thank you , record was updated");
					break;
				}
				else {
					System.out.println("Sorry , record was not found try again ");
					break;
				}
				
				
				
				
				
				
			case 9:
				System.out.println("Please enter first name of the customer :");
				String firstName = reader.readLine();
				System.out.println("Please enter middle name of the customer :");
				String middleName = reader.readLine();
				System.out.println("Please enter last name of the customer :");
				String lastName = reader.readLine();
				System.out.println("Please enter phonenumber of the customer : ");
				String phoneNumber = reader.readLine();
				System.out.println("Please enter the street of the customer :");
				String street = reader.readLine();
				System.out.println("Please enter the customers city :");
				String city = reader.readLine();
				System.out.println("Please enter the state of the customer :");
				String state = reader.readLine();
				System.out.println("Please enter customers zipcode :");
				String zipCode = reader.readLine();
				
				Customer c4 = new Customer();
				Address a4 = new Address();
				c4.setFirstName(firstName);
				c4.setLastName(lastName);
				c4.setMiddleName(middleName);
				c4.setPhoneNumber(phoneNumber);
				a4.setStreet(street);
				a4.setCity(city);
				a4.setState(state);
				a4.setZipCode(zipCode);
				c4.setAddress(a4);
				
				
				
				
				pb.addNewCustomer(c4);
				
				
			case 10:      
				pb.printAll();
				break;
			
			
			}
			}
		 	while(input != 0);
			System.out.println("You have exited the application. Bye");
		 		
			
		
			
		
		
			
	
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		

	
	
	}
	
}
