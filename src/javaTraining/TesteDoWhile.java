package javaTraining;

import java.util.Scanner;

public class TesteDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.flush();
		do {
		System.out.print("Escreva um nome: ");
		String texto = sc.nextLine();
		
		System.out.printf("Este texto contém %d letras",texto.length());
		System.out.print("Deseja repetir? <s> <n>");
		
		} while (!sc.nextLine().contentEquals("n"));
		System.out.println("END");
		
		sc.close();
	}

}
