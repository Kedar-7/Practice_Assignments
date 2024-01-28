package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiPrac {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		
		
		Stream <Integer> stream = list.stream();
		stream.distinct().forEach(System.out::println);
		Stream <Integer> stream1 = list.stream();
		Integer res = stream1.reduce((a,b) -> {return a + b;}).orElse(0);
		System.out.println(res);
		
		String  names[] = {"Raj","Ramesh kumar","Tanay","Prabhat","King Khan"};
		
		Stream<String> stream3 =	Arrays.stream(names);
		
		
		stream3.map((str)->{ System.out.print(str); return str.length();})
		        .forEach( (len)->{System.out.println(len);} );
	}

}