package appTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter order of the matrix: ");
		int order = sc.nextInt();
		Integer[][] myMatrix = new Integer[order][order];

		for (int i = 0; i < myMatrix.length; i++) {
			System.out.print("\n Enter the " + order + " elements from row " + (i + 1) + " [");
			for (int j = 0; j < myMatrix[i].length; j++) {
				myMatrix[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int mainDiagonal = 0;
		System.out.println("Negative numbers are: ");
		for (int i = 0; i < myMatrix.length; i++) {
			for (int j = 0; j < myMatrix[i].length; j++) {
				if (i == j)
					mainDiagonal += myMatrix[i][j];
				if (myMatrix[i][j] < 0)
					System.out.print(myMatrix[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("Main Diagonal sum = " + mainDiagonal);
		System.out.println("Number of rows = "+myMatrix.length);
		System.out.println("Number of columns = "+myMatrix[0].length);
	}
}
