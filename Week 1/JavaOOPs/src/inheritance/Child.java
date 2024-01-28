package inheritance;
class Vehicle {
	public void callName() {
		System.out.println("This is a vehicle ");
	}
}

class Bike extends Vehicle{
	
}

class Car extends Vehicle{
	
	public void callByName() {
		System.out.println("This vehicle is a Car ");
	}
}


public class Child {
	public static void main(String[] args) {
		Vehicle obj1 = new Bike();
		Vehicle obj2 = new Car();
		Car obj3 = new Car();
		obj1.callName();
		obj2.callName();
		obj3.callName();
		obj3.callByName();

	}
}
