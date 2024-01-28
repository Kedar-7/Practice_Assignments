package functional_interface;

public class Calc {
	public static void main(String[] args) {
		MyInterface add = (int a, int b) ->{ return a + b;};
		MyInterface sub = (int a, int b) ->{ return a - b;};
		MyInterface mul = (int a, int b) ->{ return a * b;};
		MyInterface div = (int a, int b) ->{ return a / b;};
		
		System.out.println("Addition: "+ add.calc(12,2));
		System.out.println("Addition: "+ sub.calc(12,2));

		System.out.println("Addition: "+ mul.calc(12,2));
		System.out.println("Addition: "+ div.calc(12,2));

		

	}

	
}
