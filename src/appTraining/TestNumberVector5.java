package appTraining;

import java.util.Locale;
import java.util.Scanner;

public class TestNumberVector5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Indicate number of elements in the group: ");
		Integer[] vectorA = new Integer[sc.nextInt()];
		Integer[] vectorB = new Integer[vectorA.length];
		Integer[] vectorC = new Integer[vectorA.length];
		sc.nextLine();

		System.out.println(" Enter vector-A elements: ");
		for (int i = 0; i < vectorA.length; i++) {
			System.out.printf("VecA Number(%d): ",i+1);
			vectorA[i] = sc.nextInt();
		}
		sc.nextLine();

		System.out.println("\n Enter vector-B elements: ");
		for (int i = 0; i < vectorA.length; i++) {
			System.out.printf("VecB Number(%d): ",i+1);
			vectorB[i] = sc.nextInt();
			vectorC[i] = vectorA[i] + vectorB[i];
		}
		sc.nextLine();
		
		System.out.println("\nResulting vector is: ");
		for (int vector : vectorC) {
			System.out.print(vector+", ");
		}
		sc.close();
	}
}
