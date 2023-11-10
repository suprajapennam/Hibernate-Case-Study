package com.jsp.hibernatecasestudydao.service;

import java.util.Scanner;

import com.jsp.hibernatecaseStudyentity.Cart;
import com.jsp.hibernatecasestudydao.CartDao;

public class CartServices {
CartDao cartdao=new CartDao();
Scanner sc=new Scanner(System.in);
public void addCart() {
	System.out.println("Enter Cart Id");
	int id=sc.nextInt();
	Cart cart=new Cart();
	cart.setcId(id);
	String message=cartdao.addCart();
	System.out.println(message);
	
}
}
