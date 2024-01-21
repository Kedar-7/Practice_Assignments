package strings;

public class StringPractice {

	public static void main(String[] args) {
		String str1 = new String("Hi");
		String str2 = "This is java practice";
		str1 = str1.concat(" Friends");
		System.out.println(str1);
		str1 = str1 + ",Hope you are doing well";
		System.out.println(str1);
		System.out.println(str2);

		
		
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append(" World");
		System.out.println(sb1);

	}

}
