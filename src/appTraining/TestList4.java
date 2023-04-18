package appTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestList4 {

	public static void main(String[] args) {
		
		List<String>myList = new ArrayList();
		
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
		myList.add(Integer.toString(1));
		myList.add(Boolean.toString(true));
		myList.add(Double.toString(6.0));
		System.out.println(myList);
		
		for (Object item: myList) {
			System.out.println(item.getClass());
		}
		
		Collections.sort(myList);
		System.out.println(myList);
		
		System.out.println(Collections.frequency(myList, "Marcos"));
		System.out.println(Collections.max(myList));
		Collections.replaceAll(myList,"Marcos", "MARCOS");
		System.out.println(myList);
		myList.sort(Collections.reverseOrder());
		System.out.println(myList);
		Collections.sort(myList,Collections.reverseOrder());
		System.out.println(myList);
		Collections.shuffle(myList);
		System.out.println(myList);
		Collections.swap(myList, 0, 1);
		System.out.println(myList);

		List<Integer> myIntList = new ArrayList<Integer>();
		for (int i=1; i<10; i++) {
			myIntList.add(i);
		}
		
		myIntList.remove(5);
		System.out.println(myIntList);
		
		myIntList.sort(Comparator.reverseOrder());
		System.out.println(myIntList);

		Collections.sort(myIntList);
		System.out.println(myIntList);
		

		myIntList = myIntList.stream().map(x -> 2 *x).toList();
		System.out.println(myIntList);
		
		myIntList = myIntList.stream().map(x -> 2 *x).collect(Collectors.toList());
		System.out.println(myIntList);
		
		myIntList = myIntList.stream().map(x -> x / 4).collect(Collectors.toList());
		System.out.println(myIntList);
		
		Integer myInteger = myIntList.stream().filter(x -> x % 2 == 0).findFirst().orElse(null);
		System.out.println(myInteger);
		
	}
}
