package com.jsp.hibernatecasestudydao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernatecaseStudyentity.Product;


public class ProductDao {
    Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);
    SessionFactory sf=cfg.buildSessionFactory();
    Scanner scan=new Scanner(System.in);
	
	public String addProduct(Product product) {
		
		 Session session=sf.openSession();
		 Transaction trans=session.beginTransaction();
		 session.save(product);
		 trans.commit();
		 session.close();
		 return "product successfully saved";
		 
	}

	public Product getProductById(int id) {
		return null;
	}
	public List<Product> getAllProducts(){
		Session session=sf.openSession();
		 Transaction trans=session.beginTransaction();
		 Query query=session.createQuery("from Product");
		 List<Product> products=query.getResultList();
		 for(Product p:products) {
		  System.out.println(p.getpId()+" "+p.getpName()+" "+p.getpPrice()+" "+p.getpQuantity());
		 }
		 trans.commit();
		 session.close();
		return products;
		
	}
	public String updateProducts(Product product) {
		Session session=sf.openSession();
		 Transaction trans=session.beginTransaction();
		 session.update(product);
		 trans.commit();
		 session.close();
		return "product updated successfully";
		
	}
	
	
	public String deleteProduct(Product product) {
		Session session=sf.openSession();
		 Transaction trans=session.beginTransaction();
		 session.delete(product);
		 trans.commit();
		 session.close();
		return "product deleted successfully";
		
	}
	public Product  getProductsById(int pId) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Product product = session.get(Product.class, pId);

		tr.commit();
		session.close();

		return product;

		
	}
	
}
















