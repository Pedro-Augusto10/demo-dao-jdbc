package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner (System.in);
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: Department findAll implementation ===");
		List<Department> list = departmentDao.findAll();
	    for (Department obj: list) {
		System.out.println(obj);
	    }
		
		System.out.println("\n===TEST 3: Department insert ===");
	//	Department newdepartment = new Department(null,"TI");
	//  departmentDao.insert(newdepartment);
	 //   System.out.println("Inserted! New id = "+ newdepartment.getId());
	    
	    System.out.println("\n=== TEST 4: seller update ===");
		 department = departmentDao.findById(6);
	     department.setName("Credito");
	     departmentDao.update(department);
		  System.out.println("Update completed");
		  
		   
		     System.out.println("\n=== TEST 6: seller delete ===");
		     System.out.print("Enter id for delete test: ");
		     int id = ler.nextInt();
		     
		     departmentDao.deleteById(id);
		     System.out.println("Delete completed");
	
	
		

	}

}
