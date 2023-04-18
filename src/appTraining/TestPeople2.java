package appTraining;

import java.util.Scanner;

import entities.People;

public class TestPeople2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people in the group: ");
		People[] pessoas = new People[sc.nextInt()];
		
		String auxName;
		Double auxWidth;
		int auxAge;
		int olderPersonIndex = 0;
		
		for (int i=0;i<pessoas.length;i++) {
			sc.nextLine();
			System.out.printf("\nPerson(%s) name: ",i+1);
			auxName = sc.nextLine();
			System.out.printf("Person(%d) age: ",i+1);
			auxAge = sc.nextInt();
			pessoas[i] = new People(auxName, auxAge);
			
			if (pessoas[i].getAge() >= pessoas[olderPersonIndex].getAge()) {
				olderPersonIndex = i;
			}
		}
		
		System.out.println("\nOldest Person is: "+pessoas[olderPersonIndex].getName());
		sc.close();
	}

}
