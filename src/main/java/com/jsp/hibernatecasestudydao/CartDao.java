package com.jsp.hibernatecasestudydao;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernatecaseStudyentity.Cart;




public class CartDao {
	 Configuration cfg=new Configuration().configure().addAnnotatedClass(Cart.class);
	    SessionFactory sf=cfg.buildSessionFactory();
	    Scanner scan=new Scanner(System.in);
		
		
	    
	  public String addCart() {
		  Session session=sf.openSession();
		  Transaction trans=session.beginTransaction();
		  
		 
		  trans.commit();
		  session.close();
		return "products saved to cart successfully";
		  
			 
			 
	  }  
	  
	  public void deleteCart() {
		  Session session=sf.openSession();
		  Transaction trans=session.beginTransaction();
	  }
}
