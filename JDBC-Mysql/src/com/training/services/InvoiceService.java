package com.training.services;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.training.ifaces.DataAccess;
import com.training.model.Invoice;

public class InvoiceService implements DataAccess<Invoice> {

	private Connection connection;
	
	public InvoiceService(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public boolean add(Invoice t) {
		String sql="insert into invoice values(?,?,?)";
		int rowAdded=0;
		try(PreparedStatement pstmt=connection.prepareStatement(sql)){
			pstmt.setInt(1,t.getInvoiceNumber());
			pstmt.setString(2,t.getCustomerName());
			pstmt.setDouble(3,t.getAmount());
			
			rowAdded=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded==1?true:false;
	}

	@Override
	public List<Invoice> findAll() {
		
        String sql="select * from invoice";
        List<Invoice> invoiceList=new ArrayList<Invoice>();
        
        try (PreparedStatement pstmt=connection.prepareStatement(sql)){
        	
			ResultSet result=pstmt.executeQuery();
			while(result.next()) {
				int invoiceNumber=result.getInt("invoiceNumber");
				String customerName=result.getString("customerName");
				double amount=result.getDouble("amount");
				Invoice invoice=new Invoice(invoiceNumber, customerName, amount);
				invoiceList.add(invoice);
			}
		} catch (SQLException e) {
              e.printStackTrace();
		}
		return invoiceList;
	}

	@Override
	public boolean remove(Invoice t) {
        
		String sql="delete from invoice where invoiceNumber=?";
		int rowDeleted=0;
		try(PreparedStatement pstmt=connection.prepareStatement(sql)){
			pstmt.setInt(1,t.getInvoiceNumber());
			rowDeleted=pstmt.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rowDeleted==1?true:false;
	}

	@Override
	public int update(int key) {
        
		int rowUpdated=0;
		String sql="update invoice set customerName=? where invoiceNumber=?";
		try(PreparedStatement pstmt=connection.prepareStatement(sql)){
			String name="Krishna";
			pstmt.setString(1,name);
			pstmt.setInt(2, key);
			rowUpdated=pstmt.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rowUpdated;
	}

	@Override
	public Invoice findById(int key) {
		 String sql="select * from Invoice where invoiceNumber=?";
		 Invoice findInvoice=null;
		 try (PreparedStatement pstmt=connection.prepareStatement(sql)){
			pstmt.setInt(1,key);
			ResultSet result=pstmt.executeQuery();
			if(result.next())
			{
				int invoiceNumber=result.getInt("invoiceNumber");
				String customerName=result.getString("customerName");
				double amount=result.getDouble("amount");
				findInvoice=new Invoice(invoiceNumber, customerName, amount);
				
			}
		} catch (SQLException e) {
             e.printStackTrace();
		}
		 return findInvoice;
	}

	@Override
	public List<Invoice> getSortedListBy(String field) {
        
		return null;
	}
	public void closeConnection()
	{
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
