package appTraining;

import java.util.Scanner;
import entities.Retangulo;

public class TestaRetangulo {
	
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Entre com a largura e altura do retângulo :");
		Retangulo retangulo = new Retangulo(sc.nextInt(),sc.nextInt());
		sc.nextLine();
		System.out.println(retangulo);
	}

}
