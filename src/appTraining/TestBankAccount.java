package appTraining;

import java.util.Scanner;
import entities.BankAccount;

public class TestBankAccount {
	
	public static void main (String [] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		System.out.print(" Enter New Customer name: ");
		String name = sc.nextLine();
		
		System.out.print("Initial deposit provided (true/false)?" );
		if (sc.nextBoolean()) {
			sc.nextLine();
			System.out.print("Enter initial deposit: ");
			account = new BankAccount(name,sc.nextDouble());
		}
		else
			account = new BankAccount(name);
		System.out.println(account);

		System.out.print("Make it a deposit: ");
		account.depositValue(sc.nextDouble());
		System.out.println("Updated data: "+account);

		System.out.print("Make a withdraw (TAX = "+BankAccount.TAX+"): ");
		account.withdrawValue(sc.nextDouble());
		System.out.println("Updated data: "+account);
				
		sc.close();
	}
	}
