package appTraining;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;
import entities.Room;

public class TestVector {

	public static String entraDados(Scanner sc) {
		System.out.print(" Enter name: ");
		return sc.nextLine();
	}
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vector = new String[] {sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()};
		
		for (String palavra: vector) {
			System.out.println(palavra);
		}
		
		System.out.println("-----------------");
		String[] vector2 = new String[] {entraDados(sc), entraDados(sc), entraDados(sc)};
		
		for (String palavra: vector2) {
			System.out.println(palavra);
		}
		
		sc.close();
	}
}
