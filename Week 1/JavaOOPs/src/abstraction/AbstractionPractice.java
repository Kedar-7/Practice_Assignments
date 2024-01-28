package abstraction;
class Square implements Shapes{
private double side;
	public Square() {
		
	}

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side*side;
	}

	
	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}
	
}
class Rectangle implements Shapes{
private double length;
private double width;
	
	public Rectangle() {
		
	}

	public Rectangle(double length, double width) {
	super();
	this.length = length;
	this.width = width;
}

	@Override
	public double calculateArea() {
		return length*width;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(length+width);
	}
	
}
public class AbstractionPractice {

	public static void main(String[] args) {
		Square s = new Square(7);
		Rectangle r = new Rectangle(5,9);
		
		System.out.println("Area of square is: "+s.calculateArea());
		System.out.println("Perimeter of square is: "+s.calculatePerimeter());
		System.out.println("Area of rectangle is: "+r.calculateArea());
		System.out.println("Perimeter of rectangle is: "+r.calculatePerimeter());
	}

}
