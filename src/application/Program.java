package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.crateSellerDao();

		System.out.println("1st test: seller - findById");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("2nd test: seller - findByDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
	}
}
