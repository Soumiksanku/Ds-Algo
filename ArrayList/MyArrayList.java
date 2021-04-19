package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MyArrayList {

	public static void main(String[] args) {
		List<String> fruits = new LinkedList();
		
		fruits.add("Mango");
		fruits.add("Apple");
		
		System.out.println(fruits);
		
		ArrayList<Integer> marks = new ArrayList();
		marks.add(23);
		marks.add(56);
		
		System.out.println(marks);
		
		Pair<String, Integer> p1 = new Pair("Anuj", 457);
		Pair<Boolean, String> p2 = new Pair(true, "Hello");
		System.out.println();
		p1.getDescription();
		p2.getDescription();
	}

}
