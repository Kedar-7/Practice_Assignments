package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Vicky");
		set1.add("Karan");
		set1.add("Pranav");
		set1.add("Rohit");
		System.out.println(set1);
		
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(30);
		set2.add(20);
		set2.add(55);
		set2.add(77);
		System.out.println(set2);



	}

}
