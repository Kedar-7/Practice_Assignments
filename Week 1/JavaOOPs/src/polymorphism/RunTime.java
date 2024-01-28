package polymorphism;
class Vehicle{
	public void callName() {
		System.out.println("This is a vehicle");
	}
}
class Bike extends Vehicle{
	@Override   // method overriding
	public void callName() {
		System.out.println("This vehicle is a Bike");
	}
}
class Car extends Vehicle{
	@Override   // method overriding
	public void callName() {
		System.out.println("This vehicle is a Car");
	}
}
public class RunTime {
	public static void main(String[] args) {
		Vehicle obj1 = new Vehicle();
		Vehicle obj2 = new Bike();
		Vehicle obj3 = new Car();
		
		obj1.callName();
		obj2.callName();
		obj3.callName();

	}
}
