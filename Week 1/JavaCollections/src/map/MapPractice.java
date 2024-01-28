package map;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class MapPractice {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(100, "Aniket");
		m.put(101, "Pranay");
		m.put(102, "Yash");
		m.put(103, "Sarthak");
		
		System.out.println(m);
		
		Set <Integer> set = m.keySet();
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println(k+" "+m.get(k));
		}
		Collection<String> list = m.values();
		for(String s: list) {
			System.out.println(s);
		}
	}

}
