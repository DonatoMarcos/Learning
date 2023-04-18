package javaTraining;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Estamos perto do fim?\n ==>");
		String texto = sc.nextLine();
		
		while (!texto.contains("FIM")) {
			System.out.print("Não é o fim!\n==>");
			texto = sc.nextLine();
		}
		System.out.println("Este é o fim!");
		
		sc.close();
	}

}
