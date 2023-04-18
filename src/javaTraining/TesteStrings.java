package javaTraining;

import java.util.Scanner;

public class TesteStrings {
	

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Entre com uma string para ser trabalhada:");
		String texto = sc.nextLine();
		System.out.println("String toLowerCase: "+texto.toLowerCase());
		System.out.println("String toUpperCase: "+texto.toUpperCase());
		System.out.println("String trim: "+texto.trim());
		System.out.println("String substring(5): "+texto.substring(5));
		System.out.println("String substring(5,10) "+texto.substring(5, 10));
		System.out.println("String replace('a','b') "+texto.replace('a', 'e'));
		System.out.println("String indexOf('e') "+texto.indexOf('e'));
		System.out.println("String indexOf(eu) "+texto.indexOf("eu"));
		System.out.println("String lastIndexOf('e') "+texto.lastIndexOf('e'));
		System.out.println("String lastIndexOf(eu) "+texto.lastIndexOf("eu"));
		
		for (String palavra : texto.split(" ")) {
			System.out.println("String split(' ') "+palavra);
		}
		sc.close();
	}
	

}
