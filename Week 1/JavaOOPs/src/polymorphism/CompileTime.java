package polymorphism;

class Calculations{
	// Overloading Methods
	public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    
}

public class CompileTime {
	

    public static void main(String[] args) {
    	Calculations Obj = new Calculations();

        
        System.out.println("Sum of two integers: " + Obj.add(5, 10));
        System.out.println("Sum of three integers: " + Obj.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + Obj.add(3.5, 2.5));

       }
}


