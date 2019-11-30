package ProjectPhone;


public class Phonebook 
{
	
	private Customer[] customers;
	
	public Phonebook(Customer[] customers) 
	{
		this.customers = customers;
	}
	
	public void searchByFirstName(String firstName) 
	{
		for(Customer customerItem :this.customers) 
		{
						
			if(customerItem.getFirstName().equals(firstName)) 
			{
				customerItem.printValues();
				
			}
			
		}
		
	}
	
	public void searchByLastName(String lastName) 
	{
		for(Customer customerItem :this.customers) 
		{
			if(customerItem.getLastName().equals(lastName)) 
			{
				customerItem.printValues();
				
			}
			
		}
		
		
	}
	public void searchByFullName(String fullName) 
	{
		
		for(Customer customerItem :this.customers) 
		{
			if(customerItem.getFullName().equals(fullName))
			{
				customerItem.printValues();
				
			}
			
			
		}
		
	}
	
	public void searchByPhoneNumber(String phoneNumber) 
	{
		
		for(Customer customerItem :this.customers) 
		{
			
			if(customerItem.getPhoneNumber().equals(phoneNumber))
			{
				customerItem.printValues();
				break;
			}
			
			
		}
		
	}
	public void printAll() 
	{
		for(Customer customerItem :this.customers) 
		customerItem.printValues();
		
	}
	public void searchByCity(String city) 
	{
		for(Customer customerItem :this.customers) 
		{
			if(customerItem.getAddress().getCity().equals(city))
			{
				customerItem.printValues();
			}
		}
	}
	
	public void searchByState(String state) 
	{
		for(Customer customerItem :this.customers) 
		{
			if(customerItem.getAddress().getState().equals(state))
			{
				customerItem.printValues();
			}
		}
		
	}
	
	public void addNewCustomer(Customer customer) 
	{
		
		Customer[] newArr = new Customer[this.customers.length+1];
		
		for(int i = 0 ; i<this.customers.length ;i++) 
		{
			newArr[i] = this.customers[i];
			
		}
		newArr[customers.length] = customer;
		 
		this.customers =  newArr;
		System.out.println("New record was crated");
		
	}
	public void deleteCustomer(String phoneNumber) 
	{
		Customer[] newArr1 = new Customer[this.customers.length-1];
		
			for(int i = 0 ; i < this.customers.length ; i++) 
			{
				if(phoneNumber.equals(this.customers[i].getPhoneNumber())) 
				{
			
					for(int index = 0 ; index < i ; index++) 
					{
						newArr1[index] = this.customers[index];
						
					}
					for(int j = i;j<this.customers.length-1;j++) 
					{
						newArr1[j]=this.customers[j+1];
					}
				
					
				}
				
				
				
			
			}
			
		this.customers = newArr1 ;
		System.out.println("Record was deleted");
		
		
		
		
	}
		
	public void editCustomer(String phoneNumber ,String firstName , String middleName , String lastName , String street , String state ,String city , String zipCode) 
	{
		for(int i = 0 ; i< customers.length ; i++) 
		{
			if(phoneNumber.equals(this.customers[i].getPhoneNumber())) 
			{
				Address a5 = new Address();
				this.customers[i].setFirstName(firstName);
				this.customers[i].setMiddleName(middleName);
				this.customers[i].setLastName(lastName);
				this.customers[i].setAddress(a5);
				a5.setStreet(street);
				a5.setState(state);
				a5.setCity(city);
				a5.setZipCode(zipCode);
				
			}
		}
	
		
		
		
		
	}
	public String  checkCustomers(String phoneNumber) 
	{
		String str = "";
		for(int i = 0 ; i<this.customers.length ; i++) 
		{
			if(phoneNumber.equals(this.customers[i].getPhoneNumber())) 
			{
				str = this.customers[i].getPhoneNumber();
			}
		}
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
