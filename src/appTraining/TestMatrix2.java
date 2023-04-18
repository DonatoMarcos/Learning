package appTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMatrix2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines in the the matrix: ");
		int lines = sc.nextInt();
		System.out.print("Enter number of columns in the the matrix: ");
		int columns = sc.nextInt();
		System.out.println();
		Integer[][] myMatrix = new Integer[lines][columns];

		for (int i = 0; i < myMatrix.length; i++) {
			System.out.print("Enter the " + columns + " elements from row " + (i + 1) + " [");
			for (int j = 0; j < myMatrix[i].length; j++) {
				myMatrix[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nSearch for number : ");
		int targetNumber = sc.nextInt();
		System.out.println();

		for (int i = 0; i < myMatrix.length; i++) {
			for (int j = 0; j < myMatrix[i].length; j++) {
				if (myMatrix[i][j] == targetNumber) {
					System.out.print("Found occurrence of " + targetNumber + " at row-" + i + ", column-" + j + "\n");

					List<Integer> left = new ArrayList();
					List<Integer> right = new ArrayList();
					List<Integer> up = new ArrayList();
					List<Integer> down = new ArrayList();

					for (int k = 0; k < columns; k++) {
						if (k < j) {
							left.add(myMatrix[i][k]);
						} else if (k > j) {
							right.add(myMatrix[i][k]);
						}
					}

					for (int k = 0; k < lines; k++) {
						if (k < i) {
							up.add(myMatrix[k][j]);
						} else if (k > i) {
							down.add(myMatrix[k][j]);
						}
					}
					if (left.size() != 0)
						System.out.println("Left  = " + left);
					if (right.size() != 0)
						System.out.println("Right = " + right);
					if (up.size() != 0)
						System.out.println("Up    = " + up);
					if (down.size() != 0)
						System.out.println("Down  = " + down);
				}
			}
		}
		sc.close();
	}
}
