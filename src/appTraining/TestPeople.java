package appTraining;

import java.util.Scanner;

import entities.People;

public class TestPeople {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people in the group: ");
		People[] pessoas = new People[sc.nextInt()];
		
		String auxName;
		Double auxWidth;
		Double totalWidth = 0.0;
		int auxAge;
		int minorCount = 0;
		String minorNames = "";
		
		for (int i=0;i<pessoas.length;i++) {
			sc.nextLine();
			System.out.printf("\nPerson(%s) name: ",i+1);
			auxName = sc.nextLine();
			System.out.printf("Person(%d) age: ",i+1);
			auxAge = sc.nextInt();
			System.out.printf("Person(%d) height: ",i+1);
			auxWidth = sc.nextDouble();
			pessoas[i] = new People(auxName, auxAge, auxWidth);
			
			totalWidth += pessoas[i].getWidth();
			
			if (pessoas[i].getAge() < 16) {
				minorCount +=1;
				minorNames = minorNames + pessoas[i].getName()+", ";
			}
		}
		
		System.out.printf("\nAverage heigth is: %.2f ", totalWidth/pessoas.length);
		System.out.printf("\nPercentage of people under 16 is: %.1f%%", 100.0*minorCount/pessoas.length);
		System.out.println("\nName of these persons: "+minorNames.substring(0, minorNames.length()-2));
		sc.close();
	}

}
