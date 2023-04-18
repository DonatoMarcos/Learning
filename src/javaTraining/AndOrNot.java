package javaTraining;

public class AndOrNot {

	public static void main(String[] args) {
		System.out.println((5 > 4) && (2 > 2));
		System.out.println((5 > 4) || (2 > 3));
		System.out.println(!((5 > 4) && (2 > 2)));
		System.out.println(!((5 > 4) || (2 > 3)));
		int a = 1;

		if (a != 1)
			System.out.println("TRUE-1");
		else if (a >= 1)
			System.out.println("TRUE-2");
		else
			System.out.println("FALSE");
		//
		if (!false)
			System.out.println("NOT FALSE");
	}
}
