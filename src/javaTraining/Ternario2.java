package javaTraining;

import java.util.Scanner;

public class Ternario2 {

	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print(" Digite 2 nomes: ");
		String [] nome1 = sc.nextLine().split(" ");
		
		while (nome1.length != 2) {
			System.out.println("Você não digitou 2 nomes!");
			nome1 = sc.nextLine().split(" ");
		}
		
        System.out.println((nome1[0].contains(nome1[1]) && nome1[0].length() == nome1[1].length())?"IGUAL":"DIFERENTE");
        System.out.println((nome1[0].contentEquals(nome1[1]))?"IGUAL":"DIFERENTE");
        
		
		sc.close();
	}
}
