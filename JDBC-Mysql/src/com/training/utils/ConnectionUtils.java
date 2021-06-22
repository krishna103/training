package com.training.utils;

import java.sql.*;


import java.util.Properties;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.*;

public class ConnectionUtils {
	
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
        	}catch (IOException|SQLException e) {
				e.printStackTrace();
			}
        	return connection;
        	
        }
        public static void main(String[] args) {
			System.out.println(ConnectionUtils.getMySqlConnection());
		}
        
        private static String[] getPropsAsArray() throws IOException {
			String fileName="resources/Dbconnection.properties";
			InputStream stream=ConnectionUtils.class.getClassLoader().getResourceAsStream(fileName);
        	Properties props=new Properties();
				props.load(stream);
				String url=props.getProperty("database.url");
				String passWord=props.getProperty("database.passWord");
				String userName=props.getProperty("database.userName");
				return new String[] {url,passWord,passWord};
		}
        
        public static Connection getConnectionFromPool() {
        	Connection connection=null;
        	try {
        		HikariConfig config=new HikariConfig();
        		String[] values=getPropsAsArray();
        		config.setJdbcUrl(values[0]);
        		config.setUsername(values[1]);
        		config.setPassword(values[2]);
        		config.addDataSourceProperty("maximumPoolSize","25");
        		DataSource dataSource=new HikariDataSource(config);
        		connection=dataSource.getConnection();
				
			} catch (SQLException|IOException e) {
                 e.printStackTrace();
 			}
        	return connection;
        }
		
}
