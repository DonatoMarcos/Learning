package appTraining;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;
import entities.Room;

public class TestVector2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 names, space separated: ");
		String [] names = new String [] {sc.next(), sc.next(), sc.next(), sc.next(), sc.next()};
		int teste = sc.nextInt();
		int teste1 = sc.nextInt();
		for (String name: names) {
			System.out.println("Você digitou: "+name);
		}
		System.out.println(teste + teste1);
		sc.close();
	}
}
