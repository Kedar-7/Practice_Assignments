package pojo;

import java.util.HashSet;
import java.util.Set;


public class EmployeeHashSet {

	public static void main(String[] args) {
		Set<Employee> s = new HashSet<Employee>();
		s.add(new Employee(101, "Tanmay", 35000, "Pune"));
		s.add(new Employee(103, "Tejas", 55000, "Pune"));
		s.add(new Employee(104, "Tushar", 30000, "Mumbai"));
		s.add(new Employee(105, "Shreyash", 45000, "Nagpur"));
		
		for(Employee e: s) {
			System.out.println(e);
		}

	}

}
