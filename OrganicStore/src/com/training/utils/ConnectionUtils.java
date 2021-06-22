package com.training.utils;

import java.sql.*;
import java.util.Properties;

import org.apache.log4j.Logger;

import java.io.*;

public class ConnectionUtils {
	
	   static Logger log = Logger.getLogger(ConnectionUtils.class.getName());
	
        public static Connection getMySqlConnection() {
        	Connection connection=null;
        	try {
        		
        	String fileName="resources/Dbconnection.properties";
        	
        	InputStream stream=ConnectionUtils.class.getClassLoader().getResourceAsStream(fileName);
        	Properties props=new Properties();
				props.load(stream);
				String url=props.getProperty("database.url");
				String passWord=props.getProperty("database.passWord");
				String userName=props.getProperty("database.userName");
				
				connection =DriverManager.getConnection(url,userName,passWord);
				log.info("Connected to database successfully");
        	}catch (IOException|SQLException e) {
				e.printStackTrace();
			}
        	return connection;
        	
        }
        public static void main(String[] args) {
			System.out.println(ConnectionUtils.getMySqlConnection());
		}
		
}
