package appTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import entities.Guest;
import entities.Triangle;

public class TestList2 {


	
	public static void main (String [] args) {
		List<Object> myStringList = new ArrayList<Object>();
		
		myStringList.add(2.0+3);
		myStringList.add(1);
		myStringList.add("Maria");
		myStringList.add("Bob");
		myStringList.add("Paulo");
		myStringList.add("Matheus");
		myStringList.add("Pedro");
		myStringList.add("Edna");
		myStringList.add('d');
		myStringList.add(new Guest("MD","md@"));
		myStringList.add(new Triangle(3,4,5));
		System.out.println("Original List:");
		System.out.println("--------------");
		System.out.println(myStringList);
		
		System.out.println("\nVerifications in List:");
		System.out.println("------------------------");
		System.out.println("Do we have 1 as value? "+myStringList.contains(1));
		System.out.println("My list class: "+myStringList.getClass());
		System.out.println("Index of value 5.0: "+myStringList.indexOf(5.0));
		System.out.println("Index of String with value 5.0 :"+myStringList.indexOf("5.0"));
		for (Object teste : myStringList) {
			System.out.println(String.format("%8s", teste)+", "+teste.getClass().toString().substring(6)+", ");
		}
		
		System.out.println("\nRemoval Operations:");
		System.out.println("------------------------");
		System.out.println(myStringList);
		
		myStringList.removeIf(x -> (x.equals(1)));
		System.out.println("Remove 1: "+myStringList);
		
		myStringList.removeIf(x -> ((x.toString().charAt(0) != 'P')&&(x.getClass()) == String.class));
		System.out.println("Remove not-P starting: "+myStringList);
		System.out.println("Iterator: "+myStringList.iterator());
		myStringList.removeIf(x -> (x.getClass() == String.class));
		System.out.println("Remove Strings: "+myStringList);
		myStringList.removeIf(x -> (x.toString().equals("5.0")));
		System.out.println("Remove stringfied number: "+myStringList);

		myStringList.clear();
		System.out.println("Empty List: "+myStringList);
		myStringList.add("Marcos");
		myStringList.add("Donato");
		myStringList.add("Silva");
		System.out.println("New List: "+myStringList);
		
		Stream myStream = myStringList.stream();
		System.out.print("\nFor each from a stream: ");
//		myStream.forEach(System.out::print);
		System.out.print("\nFor each from a list: ");
		myStringList.forEach(System.out::print);
		
		Stream myStream2 = myStream.filter(s -> s.toString().startsWith("M"));
		System.out.print("\nFiltered list: ");
		myStream2.forEach(System.out::print);
}
}
