package appTraining;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import entities.BankAccount;

public class TestCompareTo {

	public TestCompareTo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account1 = new BankAccount("Marcos", 1000);
		BankAccount account2 = new BankAccount("Donato", 500);
		BankAccount account3 = new BankAccount("Silva", 250);
				
		List<BankAccount> myList = new ArrayList();
		myList.add(account1);
		myList.add(account2);
		myList.add(account3);
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);

	}

}
