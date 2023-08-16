package com.productDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connectionjdbc.Connectionjdbc;
import com.entity.Product;


public class productDao {

	public static boolean insertProduct(Product pr )
	{
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="Insert into products(p_id, p_name, p_price, p_quality) values(?,?,?,?)";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, pr.getProductId());
		p.setString(2, pr.getProductName());
		p.setInt(3, pr.getProductPrice());
		p.setInt(4, pr.getProductQuality());
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}
	
	public static boolean deleteProduct(int userId)
	{
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="delete from products where p_id=?";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, userId);
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}
	
	public static void showAllProduct()
	{
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="select * from products";
		Statement s= con.createStatement();
		
		ResultSet set=s.executeQuery(q);
		
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			int price=set.getInt(3);
			int quality=set.getInt(4);
			
			System.out.println("ID:"+ id);
			System.out.println("Name:"+name);
			System.out.println("Price:"+price);
			System.out.println("Quality:"+quality);
			
			System.out.println("----------------------------");
			
		}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static boolean updateProduct(Product p1, int userId2) {
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="update products set p_id=?, p_name=?,p_price=? ,p_quality=? where p_id=?";
		//(p_id, p_name, p_price, p_quality)
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, p1.getProductId());
		p.setString(2, p1.getProductName());
		
		
		p.setInt(3, p1.getProductPrice());
		p.setInt(4, p1.getProductQuality());
		p.setInt(5, userId2);
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
		
	}

}
