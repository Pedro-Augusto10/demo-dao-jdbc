package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll implementation ===");
	        list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newseller =new Seller(null,"Pedro","Pedro@gmail.com",new Date(),2000.0,department);
	   // sellerDao.insert(newseller);
	  //  System.out.println("Inserted! New id = "+ newseller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		 seller = sellerDao.findById(9);
	    //seller.setName("Sandra");
	    //seller.setEmail("Sandra@gmail.com");
	    //  sellerDao.update(seller);
	    //  System.out.println("Update completed");
	     
	     System.out.println("\n=== TEST 6: seller delete ===");
	     System.out.print("Enter id for delete test: ");
	     int id = ler.nextInt();
	     
	     sellerDao.deleteById(id);
	     System.out.println("Delete completed");
	     
	     ler.close();
		
	}

}
