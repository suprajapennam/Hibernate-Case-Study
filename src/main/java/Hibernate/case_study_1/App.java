package Hibernate.case_study_1;

import java.util.Scanner;

import com.jsp.hibernatecaseStudyentity.Product;
import com.jsp.hibernatecasestudydao.service.CartServices;
import com.jsp.hibernatecasestudydao.service.ProductServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	ProductServices p=new ProductServices();
    	CartServices c=new CartServices();

//		while(true)
//		{
			Scanner sc=new Scanner(System.in);
			System.out.print("1.Enter 1 to save data\n"
					+ "2.Enter 2 to get product by id\n"
					+ "3.Enter 3 to get All products\n"
					+ "4.Enter 4 to update product\n"
					+ "5.Enter 5 to Delete product\n"
					+"6.Enter 6 to AddCart\n");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1: p.addProduct();
			break;

			case 2: p.getProductById();
			break;

			case 3: p.getAllProducts();
			break;

			case 4: p.updateProduct();
			break;

			case 5: p.deleteProduct();
			break;
			
			case 6:c.addCart();
			break;
			default:
				System.err.println("Invalid Choice");
			}
//		}
	}
      
       
       
       
       
    	
    	
    	   	
    }

