package entities;

public class Employee {
	
	String name;
	Double grossSalary;
	Double percentageTax;
	
	public Employee(String name, double grossSalary, double percentageTax) {
		this.name = name.substring(0,1).toUpperCase() 
				  + name.substring(1).toLowerCase();
		this.grossSalary = grossSalary;
		this.percentageTax = percentageTax;
	}
	
	public Double netSalary() {
		return grossSalary*(1-percentageTax/100);
	}
	
	public void increaseSalary(Double increasePercentage) {
		this.grossSalary +=grossSalary*increasePercentage/100;
	}
	
	public String toString() {
		return  "| Employee Name: "
	           + name
	           + " | Employee gross Salary: $"
	           + grossSalary
	           + " | Employee net Salary: $"
	           + netSalary();
	}
}
