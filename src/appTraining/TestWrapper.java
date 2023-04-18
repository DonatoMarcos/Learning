package appTraining;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;
import entities.Room;

public class TestWrapper {

	public static void main(String[] args) {

		// primitives can not be null whereas wrappers can.
		//int a = null;
		Integer b = null;

		// primitives unboxing requires cast.
		int c = 10;
		Object d = c;
		int e = (int) d;

		// wrapper unboxing requires no cast.
		int f = 20;
		Integer g = f;
		int h = g;
		
		System.out.println(String.format("%4s%n", b)
						 + String.format("%4s", c)
						 + String.format("%4s", d)
						 + String.format("%4s", e)
						 + String.format("%4s", f));
	}

}
