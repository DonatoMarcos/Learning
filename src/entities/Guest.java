package entities;

public class Guest {

	String name;
	String email;
	
	
	
	public Guest(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public String toString( ) {
		return "Name: "
	           +name
	           +" Email: "
	           +email;
	}
	
	
}
