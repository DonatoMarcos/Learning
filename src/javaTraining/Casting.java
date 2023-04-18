package javaTraining;

public class Casting {
	
	public static void main (String [] args) {
		int x = 5;
		int y = 3;
		double soma;
		
		soma = x/y;
		System.out.println("Truncated soma result :"+soma);
		
		soma = (double)x/y;
		System.out.printf("Soma result as decimal: %.30f",soma);
	}
	
	

}
