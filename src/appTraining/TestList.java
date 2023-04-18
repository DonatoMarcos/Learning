package appTraining;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	private static List<Object> mylist;

	public TestList() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args) {
		setMylist(new ArrayList<Object> ());
	}

	public static List<Object> getMylist() {
		return mylist;
	}

	public static void setMylist(List<Object> mylist) {
		TestList.mylist = mylist;
	}

}
