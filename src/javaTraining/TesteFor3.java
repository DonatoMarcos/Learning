package javaTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class TesteFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print(" Divisores de: ");
		int numero = sc.nextInt();
		Collection<Integer> divisores = new ArrayList<Integer>();
		for (int i=numero; i>1; i--) {
			if (numero % i == 0)
			{
				divisores.add(i);
			}
		}
        
		System.out.println("Resultado: "+divisores.toString());
        sc.close();
		
}

}
