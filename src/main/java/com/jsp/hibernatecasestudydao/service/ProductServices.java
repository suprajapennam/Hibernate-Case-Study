package com.jsp.hibernatecasestudydao.service;

import java.util.Scanner;

import org.hibernate.Session;

import com.jsp.hibernatecaseStudyentity.Product;
import com.jsp.hibernatecasestudydao.ProductDao;

public class ProductServices 
{
 ProductDao productDao=new ProductDao();
 Scanner sc=new Scanner(System.in);
 public void addProduct() {
	 System.out.println("Enter Product Name");
	 String name=sc.next();
	 System.out.println("Enter Product price");
	 int price=sc.nextInt();
	 System.out.println("Enter Product Quantity");
	 int quantity=sc.nextInt();
	 Product product=new Product();
	 product.setpPrice(price);
	 product.setpName(name);
	 product.setpQuantity(quantity);
	 String message=productDao.addProduct(product);
	 System.out.println(message);
 }
 
 public void updateProduct() {
	 System.out.println("Enter the product id to update:");
	 int id=sc.nextInt();
	 Product product=productDao.getProductById(id);
	 if(product!=null){
     System.out.println(product.getpName()+" "+product.getpPrice()+" "+product.getpQuantity());
	 System.out.println("Enter product name");
	 String name=sc.next();
	 System.out.println("Enter the product price ");
	 double price=sc.nextDouble();
	 System.out.println("Enter the product quantity ");
	 int quantity=sc.nextInt();
	  
	 product.setpPrice(price);
	 product.setpName(name);
	 product.setpQuantity(quantity);
	 productDao.updateProducts(product);
	 
	 }
	 else {
		 System.err.println("product not found with the given Id:");
	 }
	 
	
 }
 public void deleteProduct() {
	 System.out.println("Enter the product id to delete:");
	 int id=sc.nextInt();
	 Product product=productDao.getProductById(id);
	 if(product!=null) {
		 System.out.println(product.getpName()+" "+product.getpPrice()+" "+product.getpQuantity());
		 System.out.println("Enter product name");
		 String name=sc.next();
		 System.out.println("Enter product price");
		 int price=sc.nextInt();
		 System.out.println("Enter product quantity");
		 int quantity=sc.nextInt();
		 
		 product.setpPrice(price);;
		 product.setpName(name);
		 product.setpQuantity(quantity);
		 productDao.deleteProduct(product);
	 }
	 else {
		 System.err.println("product not deleted with the given id");
	 }
 }

public void getAllProducts() {
	// TODO Auto-generated method stub
	
}

public void getProductById() {
	// TODO Auto-generated method stub
	
}


 
}
