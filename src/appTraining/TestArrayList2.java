package appTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.People;

public class TestArrayList2 {


	public static void main (String [] args) {
		
		List<String> myListString = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		// Fill in data.		
		boolean sair = false;
		while (!sair) {
			System.out.println("Enter next data: ");
			myListString.add(sc.nextLine());

			for (String myString: myListString)
				System.out.println("MyStringData : "+myString);
			System.out.println("Current String Size: "+myListString.size()+"\n");

			System.out.println("Sair? <true><false>");
			if (sc.hasNextBoolean())
				sair = sc.nextBoolean();
			sc.nextLine();
		}

		// Fill in data.		
		sair = false;
		while (!sair) {
			
			System.out.println("Enter next position: ");
			int position = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter next data: ");
			myListString.add(position
					,sc.nextLine());

			for (String myString: myListString)
				System.out.println("MyStringData : "+myString);
			System.out.println("Current String Size: "+myListString.size()+"\n");

			System.out.println("Sair? <true><false>");
			if (sc.hasNextBoolean())
				sair = sc.nextBoolean();
			sc.nextLine();
		}
		
		sc.close();
	}
	
}
