package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.crateSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		//System.out.println("1st test: seller - findById");
		//Seller seller = sellerDao.findById(3);
		//System.out.println(seller);
		//
		//System.out.println("\n2nd test: seller - findByDepartment");
		//Department department = new Department(2, null);
		//List<Seller> list = sellerDao.findByDepartment(department);
		//list.forEach(System.out::println);
		//
		//System.out.println("\n3rd test: seller - findAll");
		//list = sellerDao.findAll();
		//list.forEach(System.out::println);
		//
		//System.out.println("\n4th test: seller - insert");
		//Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Success. New id: " + newSeller.getId());
		//
		//System.out.println("\n5th test: seller - update");
		//seller = sellerDao.findById(1);
		//seller.setName("Marha Waine");
		//sellerDao.update(seller);
		//System.out.println("Update completed.");
		//
		//System.out.println("\n6th test: seller - delete");
		//sellerDao.deleteById(15);
		//System.out.println("Delete completed.");

		System.out.println("\nDeparment tests");

		System.out.println("\n1st test: department - findById");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n2nd test: department - findAll");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);

		System.out.println("\n3rd test: department - insert");
		Department newDepartment = new Department(null, "Story");
		departmentDao.insert(newDepartment);
		System.out.println("Success. New id: " + newDepartment.getId());

		System.out.println("\n4th test: department - update");
		department = departmentDao.findById(6);
		department.setName("Comics");
		departmentDao.update(department);
		System.out.println("Update completed.");

		System.out.println("\n5th test: department - delete");
		departmentDao.deleteById(5);
		System.out.println("Delete completed.");
	}
}
