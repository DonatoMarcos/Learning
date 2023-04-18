package appTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.People;

public class TestArrayList1 {


	public static void main (String [] args) {
		
		List<String> myListString = new ArrayList<>();
		List<Integer> myListInteger = new ArrayList<>();
		List<Double> myListDouble = new ArrayList<>();
		List<People> myListPessoas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		boolean sair = false;
		while (!sair) {
			System.out.println("Enter next data: ");
			if (sc.hasNextInt())
				myListInteger.add(sc.nextInt());
			else if (sc.hasNextDouble())
				myListDouble.add(sc.nextDouble());
			else
				myListString.add(sc.next());

			for (String myString: myListString)
				System.out.println("MyStringData : "+myString);
			System.out.println("Current String Size: "+myListString.size()+"\n");

			for (Integer myInteger: myListInteger)
				System.out.println("MyIntegerData : "+myInteger);
			System.out.println("Current Integer Size: "+myListInteger.size()+"\n");

			for (Double myDouble: myListDouble)
				System.out.println("MyDoubleData : "+myDouble);
			System.out.println("Current Double Size: "+myListDouble.size()+"\n");

			System.out.println("Sair? <true><false>");
			if (sc.hasNextBoolean())
				sair = sc.nextBoolean();
		}
		
		sc.close();
	}
	
}
