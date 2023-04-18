package javaTraining;

import java.util.Scanner;

public class Parsing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto = sc.nextLine();
		String []palavras = texto.split(" ");
		for (String palavra: palavras) {
			try {
				Double.parseDouble(palavra.trim());
				System.out.println("Double digitado: "+palavra);
				}
			catch (NumberFormatException e){
				
			}
		}
		sc.close();
	}
}
