package appTraining;

import java.util.Scanner;

import entities.People;

public class TestPeople3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people in the group: ");
		People[] pessoas = new People[sc.nextInt()];
		
		String auxName;
		Double auxWidth;
		char auxGender;
		int highWidthIdx = 0;
		int lowWidthIdx = 0;
		double womenWidthAverage = 0;
		int numberMans = 0;
		
		for (int i=0;i<pessoas.length;i++) {
			sc.nextLine();
			System.out.printf("\nPerson(%s) name: ",i+1);
			auxName = sc.nextLine();
			System.out.printf("Person(%d) gender: ",i+1);
			auxGender = sc.nextLine().charAt(0);
			System.out.printf("Person(%d) width: ",i+1);
			auxWidth = sc.nextDouble();
			pessoas[i] = new People(auxName, auxWidth, auxGender);
			
			if (pessoas[i].getWidth() >= pessoas[highWidthIdx].getWidth()) {
				highWidthIdx = i;
			}
			if (pessoas[i].getWidth() <= pessoas[lowWidthIdx].getWidth()) {
				lowWidthIdx = i;
			}
			if (pessoas[i].getGender() == 'F')
				womenWidthAverage +=pessoas[i].getWidth();
			else
				numberMans +=1;
		}
		
		System.out.println("\nHighest Person is: "+pessoas[highWidthIdx].getName());
		System.out.println("\nShortest Person is: "+pessoas[lowWidthIdx].getName());
		System.out.println("\nNumber of Men is: "+numberMans);
		if (womenWidthAverage > 0) {
			System.out.println("\nAverate tall of Women is: "+womenWidthAverage/(pessoas.length-numberMans));
		}
		sc.close();
	}

}
