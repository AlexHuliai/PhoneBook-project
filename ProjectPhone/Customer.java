package ProjectPhone;


public class Customer  {
	
	
	
	private String firstName ;
	private String lastName;
	private String middleName;
	private Address address ;
	private String phoneNumber ;
	
	
	
	

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Customer() {
		super();
	}


	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String fistName) {
		this.firstName = fistName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFullName() {
		
		String resultFullName = "";
			
		if(this.middleName == "") {
			resultFullName = this.firstName + " " + this.lastName ;
		}
		else {
			resultFullName = this.firstName + " " + this.middleName + " " + this.lastName ;
		}
		
		return resultFullName;
		
	}
	
	public   void printValues() {
		
		System.out.printf("%s, %s, %s %s %s %s \n" ,this.getFullName(),this.correctNumber(this.phoneNumber),this.getAddress().getStreet(),this.getAddress().getCity(),this.getAddress().getState(),this.getAddress().getZipCode()  );
		
	}
	
	public String correctNumber(String phoneNumber) {
		
		String number = phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)- $2-$3");
		return number ;
		
	}
	
	

}
