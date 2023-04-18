package appTraining;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class TestVetorProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Indicate number of Products: ");
		Products products[] = new Products[sc.nextInt()];
		sc.nextLine();
		Double soma = 0.0;
		
		System.out.println("Enter product data");
		for (int i=0; i<products.length; i++) {
			products[i] = new Products();
			System.out.print("Product["+(i+1)+"] = ");
			System.out.print("Name = ");
			products[i].setName(sc.nextLine());
			System.out.print("Price = ");
			products[i].setPrice(sc.nextDouble());
			sc.nextLine();
			System.out.print("Initial Quantity = ");
			products[i].setQuantity(sc.nextInt());
			sc.nextLine();
			soma = soma + (products[i].getPrice() 
					     * products[i].getQuantity());
		}
		
		System.out.printf("\nTotal value stored is US$: %.2f",(soma));
		sc.close();

	}

}
