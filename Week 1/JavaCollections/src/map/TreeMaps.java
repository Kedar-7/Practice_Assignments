package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		TreeMap<Integer,String>map =  new TreeMap();
		
		map.put(101, "Rahul");
		map.put(104, "Ram");
		map.put(102, "Raju");
		map.put(103, "Ravi");
		
		System.out.println(map);
		
		for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
		
		for (String value : map.values()) {
            System.out.println(value);
        }
	}

}
