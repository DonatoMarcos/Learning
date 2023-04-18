package appTraining;

import java.util.Locale;
import java.util.Scanner;

public class TestNumberVector7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numberOfOdds = 0;

		System.out.print("Indicate number of elements in the group: ");
		Integer[] numeros = new Integer[sc.nextInt()];
		sc.nextLine();

		System.out.println(" Enter vector elements: ");
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Number(%d): ",i+1);
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				numberOfOdds +=1;
			}
		}
		
		int j = 0;
		int[] numbersOdd = new int[numberOfOdds];
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				numbersOdd[j] = numeros[i];
				j +=1;
			}
		}
		
		int soma = 0;
		for (int numero : numbersOdd) {
			soma += numero;
		}
		
		if (soma == 0)
			System.out.println("No odd number!");
		else
			
			System.out.print("Average of "+ numbersOdd.length+" odd numbers: "+soma/numbersOdd.length);		
		}
		
	}
