 package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Dept;

public class Client {
	
  static	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		IDeptDao dao = new DeptDaoImp();
		
		boolean flag = true;
		
		
		
		while(flag) {
		System.out.println("****WELCOME DMS ***");
		System.out.println("1. INSERT");
		System.out.println("2. UPDATE");
		System.out.println("3. DELETE");
		System.out.println("4. SELECT BY ID");
		System.out.println("5. SELECT ALL");
		System.out.println("6. EXIT");
		
		
		int choice =	scanner.nextInt();
		
		
		
			switch (choice) {
			case 1:
				
				Dept dept =	readData();
				
				int count =	dao.insert(dept);
				
				System.out.println(count +" record inserted successfully");
				
				break;
				
			case 2:
				
				Dept dept1 =	updateData();
				
				int count1  =	dao.update(dept1);
				
				System.out.println(count1 +" record inserted successfully");
				
				break;
				
			case 3:
				System.out.println("Enter DNo which you want to delete: ");
				int n = scanner.nextInt();
				int res =  dao.deleteOne (n);
				
				break;
				
			case 4:
				System.out.println("Enter DNo: ");
				int n1 = scanner.nextInt();
				int res1 =  dao.selectOne (n1);
				
				break;
				
			case 5:
				
				List<Dept> list = dao.selectAll();
				list.stream().forEach(System.out::println);
				
				break;
				
			case 6:
				
				  flag = false;
				  System.out.println("Thank you, Come Again");
				break;

			default:
				break;
			}
		}
}
	
	
	
	public static Dept  readData() {
		
		
		System.out.println("Enter DNO");
		
		int dno =scanner.nextInt();
		
			scanner.nextLine();
		
		System.out.println("Enter DNAME");
		
		String dname = scanner.nextLine();
		
		System.out.println("Enter LOCATION");
		
		String location = scanner.nextLine();
		
		
		Dept dept = new Dept(dno,dname,location);
		
		return dept;
	}
	
public static  Dept  updateData() {
		
		
		System.out.println("Enter DNO");
		int dno = scanner.nextInt();
		scanner.nextLine();  
		
		System.out.println("Enter DName");
		String dname = scanner.nextLine();  
		System.out.println("Enter LOCATION");
		String location = scanner.nextLine();
		
		
		Dept dept = new Dept(dno,dname,location);
		
		return dept;
	}
	
	
	
	

}