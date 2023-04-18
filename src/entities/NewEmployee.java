package entities;

public class NewEmployee {
	
	private Integer ID;
	private String name;
	private Double salary;
	

	public NewEmployee(Integer iD, String name, Double salary) {
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
	

	public Integer getID() {
		return ID;
	}



	public String getName() {
		return name;
	}



	public Double getSalary() {
		return salary;
	}



	public void increaseSalary(Double increasePercentage) {
		this.salary +=salary*increasePercentage/100;
	}
	
	public String toString() {
		return ID
		       + ", "
	           + name
	           + ", $"
	           + String.format("%.2f", salary);
	}
}
