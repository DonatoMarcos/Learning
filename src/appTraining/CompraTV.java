package appTraining;

import java.util.Scanner;

import entities.Products;
import entities.Triangle;

public class CompraTV {
	
	public static void main (String [] args) throws Exception {
		
		Scanner sc = new Scanner (System.in);
		Products product = new Products();
		
		System.out.println("Enter product data");
		System.out.print("Name = ");
		product.setName(sc.nextLine());
		System.out.print("Price = ");
		product.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.print("Initial Quantity = ");
		product.setQuantity(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Product Data: "+product);
		
		System.out.print("Enter number dsof products to be added to Stock: ");
		product.addProducts(sc.nextInt());
		System.out.println("Product Data: "+product);
		
		System.out.print("Enter number of products to be removed from Stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println("Product Data: "+product);
    	
		sc.close();
	}

}
