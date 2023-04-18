package appTraining;

import java.util.Locale;
import java.util.Scanner;

public class TestNumberVector3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		int higherNumber = 0, higherIndex = 0;
		String textoSaida = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("Indicate number of elements in the group: ");
		Integer [] numeros = new Integer[sc.nextInt()];

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Number(%d): ",i+1);
			numeros[i] = sc.nextInt();
			
			if (numeros[i] > higherNumber) {
				higherNumber = numeros[i];
				higherIndex = i+1;
			}
		}

		System.out.print("\nHighest Number is: " + higherNumber);
		System.out.print("\nIndex position of this number is: "+ higherIndex);

		sc.close();
	}
}
