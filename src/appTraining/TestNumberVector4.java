package appTraining;

import java.util.Locale;
import java.util.Scanner;

public class TestNumberVector4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		int oddNumbers = 0;
		String textoSaida = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("Indicate number of elements in the group: ");
		Integer[] numeros = new Integer[sc.nextInt()];

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Number(%d): ",i+1);
			numeros[i] = sc.nextInt();
			
			if (numeros[i] % 2 == 0) {
				textoSaida = textoSaida + numeros[i] + ", ";
				oddNumbers += 1;
			}
		}

		System.out.print("\nOdd numbers are: " + textoSaida.substring(0, textoSaida.length() - 2));
		System.out.print("\nQuantity of off numbers: "+oddNumbers);

		sc.close();
	}
}
