package appTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.NewEmployee;

public class TestNewEmployee {

	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<NewEmployee> employees = new ArrayList<NewEmployee>();

		System.out.print("\nHow many employees will be registered: ");
		Integer numEmployees = sc.nextInt();
		
		for (int i = 0; i < numEmployees; i++) {
			System.out.print(" \nEmployee: #"+(i+1));
			System.out.print(" ID: ");
			Integer auxID = getEmployeeID(sc, employees);
			System.out.print(" Name: ");
			String auxName =sc.next();
			System.out.print(" Salary: ");
			Double auxSalary =sc.nextDouble();
			employees.add(new NewEmployee(auxID, auxName, auxSalary));
		}
		employees.forEach(System.out::println);
		
		NewEmployee luckyEmployee = getValidEmployee(sc, employees);
		System.out.print("Salary increase percentage: ");
		luckyEmployee.increaseSalary(sc.nextDouble());
		
		employees.stream().forEach(System.out::println);
		sc.close();
	}
	
	
	public static Integer getEmployeeID(Scanner sc, List<NewEmployee> employees) {
		NewEmployee auxEmployee = null;
		int validID = 0;
		do {
			int auxID = sc.nextInt();
			auxEmployee = employees
						    .stream()
						    .filter(x -> x.getID().equals(auxID))
						    .findFirst()
							.orElse(null);

			if (auxEmployee != null) {
				System.out.println("ID already exist...");
				System.out.print(" ID: ");
			}
			else
				validID = auxID;
			
		} while (auxEmployee != null);
		
		return validID;
	
	}

	public static NewEmployee getValidEmployee(Scanner sc, List<NewEmployee> employees) {
		NewEmployee auxEmployee = null;
		do {
			System.out.print("Enter employee ID which will have salary adjusted: ");

			int auxID = sc.nextInt();
			auxEmployee = employees
						    .stream()
						    .filter(x -> x.getID().equals(auxID))
						    .findFirst()
							.orElse(null);

			if (auxEmployee == null)
			   System.out.println("Invalid ID...");
			
		} while (auxEmployee == null);
		
		return auxEmployee;
	
	}
}	
