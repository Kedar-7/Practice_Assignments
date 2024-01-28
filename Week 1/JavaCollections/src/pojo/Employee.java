package pojo;

public class Employee  {
	private int id;
	private String ename;
	private double salary;
	private String location;
	
	// constructor
	public Employee(int id, String ename, double salary, String location) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
		this.location = location;
	}
	
	// getters and setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	


	// toString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + ", location=" + location + "]";
	}
	
	

}
