package arrays;

public class Arrays {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};

	    
	    System.out.println("Elements of array are:");
	    for (int i = 0; i < numbers.length; i++) {
	        System.out.println("Element at index " + i + ": " + numbers[i]);
	    }
	    
	    System.out.println(numbers[2]);
	    
	    int[] arr = new int[3];
	    arr[0] = 6;
	    arr[1] = 7;
	    arr[2] = 8;
//	    arr[3] = 6;
	    for (int i = 0; i < arr.length; i++) {
	        System.out.println("Element at index " + i + ": " + arr[i]);
	    }


	}

}
