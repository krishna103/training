package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepository {

	
	Connection connection=null;
	public AlienRepository() {
		String url="jdbc:mysql://localhost:3306/test";
		String userName="root";
		String passWord="mysql.ks18@@";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,userName,passWord);
		} catch (SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public List<Alien> getAliens(){
		List<Alien> aliens=new ArrayList<>();
		String sql="select * from alien";
		try {
			Statement st=connection.createStatement();
			ResultSet rs= st.executeQuery(sql);
			while(rs.next()) {
				Alien a=new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
				aliens.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aliens;
	}
	public Alien getAlien(int id) {
		String sql="select * from alien where id="+id;
		Alien a=new Alien();
		try {
			Statement st=connection.createStatement();
			ResultSet rs= st.executeQuery(sql);
			if(rs.next()) {
				
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public void create(Alien a1) {
        String sql="insert into alien values(?,?,?)";
        try {
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1,a1.getId());
			pst.setString(2,a1.getName());
			pst.setInt(3,a1.getPoints());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
	}
	
	public void update(Alien a1) {
        String sql="update alien set name=?, points=? where id=?";
        try {
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(3,a1.getId());
			pst.setString(1,a1.getName());
			pst.setInt(2,a1.getPoints());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
	}
	public void delete(int id) {
		String sql="delete from alien where id=?";
        try {
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1,id);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}