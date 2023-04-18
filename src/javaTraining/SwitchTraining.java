package javaTraining;

import java.util.Scanner;

public class SwitchTraining {

	public static void main(String[] args) {

		System.out.print("Digite 1 ou 2: ");
		Scanner sc = new Scanner(System.in);
		Integer numero = sc.nextInt();
		sc.nextLine(); // Adiciona a quebra de linha.

		switch (numero) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("neiter 1 nor 2");
		}

		System.out.print("Digite TRUE: ");
		String testString = sc.nextLine();
		
		switch (testString) {
		case "TRUE":
			System.out.println("TRUE");
			break;
		default:
			System.out.println("FALSE");
		}
		
		sc.close();
		
	}

}
