package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(50);
		
		
		System.out.println(list);
		for(Integer l: list) {
			System.out.println(l);
		}
		Collections.sort(list);
		System.out.println(list);
		for(Integer l: list) {
			System.out.println(l);
		}
	}
}
