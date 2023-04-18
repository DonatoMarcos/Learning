package appTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestList3 {

	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		myList.add(0, "Marcos");
		System.out.println(myList);

		myList.set(0, "Donato");
		System.out.println(myList);
		
		myList.remove("Donato");
		System.out.println(myList);
		
		myList.add("Marcos");
		myList.add("Donato");
		myList.add("Silva");
		myList.add("Marcos-2");
		myList.add("Donato-2");
		myList.add("Silva-2");
		System.out.println(myList);

		myList.forEach(x -> System.out.println("!!"+x));
		
		System.out.println(myList.subList(1, 3));
		
		myList.forEach(System.out::println);
		
		Stream <String>myStream = myList.stream();
		System.out.println(myStream.toList());
		
		myStream = myList.stream();
		System.out.println(myStream.toArray()[0]);

		myStream= myList.stream();
		System.out.println(myStream.filter(x -> x.charAt(0)=='M').toList());
		
		myStream = myList.stream().filter(x -> x.toString().charAt(0)!='M');
		System.out.println(myStream.toList());
		
		myList.add("Marcos");
		System.out.println(myList);
		myStream= myList.stream();
		System.out.println(myStream.distinct().toList());
		
		myStream = myList.stream();
		System.out.println(myStream.map(x -> x.substring(3)).toList());
		
		myStream = myList.stream();
		myStream.forEach(x -> System.out.println(x.substring(3)));
		
	}
}
