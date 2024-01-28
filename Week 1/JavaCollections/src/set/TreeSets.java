package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		Set<String>s = new TreeSet<String>();
		s.add("D");
		s.add("C");
		s.add("B");
		s.add("A");
		s.add("E");

		System.out.println(s);
		
		Set<Integer>s1 = new TreeSet<Integer>();
		s1.add(4);
		s1.add(3);
		s1.add(2);
		s1.add(1);
		s1.add(5);
		System.out.println(s1);
	}

}
