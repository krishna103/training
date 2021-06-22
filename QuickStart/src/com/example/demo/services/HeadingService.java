package com.example.demo.services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import com.example.entity.Store;
public class HeadingService {

    private Connection connection;
	
	public HeadingService(Connection connection) {
		super();
		this.connection = connection;
	}

	Map<String,Store> headings;
	public HeadingService() {
		this.headings=new HashMap<>();
		
		this.headings.put("CHN",new Store("Kirana Stores","chennai",34343));
		this.headings.put("PNQ",new Store( "Dmart","pune",34343));
		this.headings.put("DEL",new Store("Viput Mart","saket",5455));
		this.headings.put("BOM",new Store("Reliance Mart","Andheri",45454));
	}
	
	public Store getHeading(String key)
	{
		return this.headings.get(key);
	}
	public int add(Store store)
	{
		int rowsAdded=0;
		String sql="insert into store values(?,?,?)";
		try(PreparedStatement pstmt=connection.prepareStatement(sql)){
			pstmt.setString(1,store.getStoreName());
			pstmt.setString(2,store.getLocation());
			pstmt.setDouble(3,store.getPhoneNumber());
			
			
			rowsAdded=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsAdded;
	}
}
