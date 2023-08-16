package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Product;
import com.productDao.productDao;



public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to Bakery Management System Application");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 to ADD new Product");
			System.out.println("press 2 to delete Product");
			System.out.println("press 3 to display Product");
			System.out.println("press 4 to update Product");
			System.out.println("press 5 to exit Application");
			
			
			int c=Integer.parseInt(br.readLine());
			
			switch (c) 
			{
			case 1: //add product
				System.out.println("enter Product id :");
				int id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Product name :");
				String name= br.readLine();
				
				System.out.println("Enter Product price :");
				int price = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Product quality between 1 to 5 :");
				int quality= Integer.parseInt(br.readLine());
				
				//create student object to store the data 
				Product p1 = new Product(id,name, price,quality);
				
				
				boolean ans = productDao.insertProduct(p1);
				
				if(ans)
				{
					System.out.println("Product is added successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(p1);
				break;
			
			case 2: // delete product
				System.out.println("enter product id which you want to delete");
				int userId=Integer.parseInt(br.readLine());
				
				boolean f=productDao.deleteProduct(userId);
				if(f)
				{
					System.out.println("Product deleted successfully");
				}
				else
				{
					System.out.println("Something went wrong...!");
				}
				break;
			
			case 3: // display products
				productDao.showAllProduct();
	
				break;
				
			case 4://update product
				System.out.println("enter product id whose data you want to update");
				int userId2 = Integer.parseInt(br.readLine());
				
				System.out.println("enter Product id :");
				int id2 = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Product name :");
				String name2= br.readLine();
				
				System.out.println("Enter Product price :");
				int price2= Integer.parseInt(br.readLine());
					
				System.out.println("Enter Product quality :");
				int quality2= Integer.parseInt(br.readLine());
				
				
			
				Product p2=new Product(id2,name2,price2,quality2);
				boolean ans2 =productDao.updateProduct(p2,userId2);
				
				if(ans2)
				{
					System.out.println("Product is updated successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(p2);
				break;
				
				
			case 5: // exit
				go=false;
				break;
				
				
			default:
				System.out.println("wrong choice try again");
			}
			
			
			
			}
		System.out.println("thankyou for using my application!!");
			
			
		}

	}