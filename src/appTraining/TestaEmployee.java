package appTraining;

import java.util.Scanner;

import entities.Employee;

public class TestaEmployee {

	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Employee   name: ");
		String name1 = sc.nextLine();
		System.out.print("\nEnter Employee salary: ");
		Double salary1 = sc.nextDouble();
		System.out.print("\nEnter Tax  percentage: ");
		Double percentage1 = sc.nextDouble();
		sc.nextLine();
		Employee testEmployee = new Employee(name1, salary1, percentage1);
		System.out.println(testEmployee);
		
		System.out.print("\nEnter percentage salary increase: ");
		testEmployee.increaseSalary(sc.nextDouble());
		System.out.println(testEmployee);
		
		
		sc.close();
	}
}
