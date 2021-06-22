package com.training;

import java.sql.Connection;

import com.training.model.Invoice;
import com.training.services.CustomerService;
import com.training.utils.ConnectionUtils;

public class UsingTxn {

	public static void main(String[] args) {


		Invoice inv2=new Invoice(105,"bam",60);
		Connection connection=ConnectionUtils.getConnectionFromPool();
		System.out.println(connection);
//		CustomerService custService=new CustomerService(connection);
//		custService.add(inv2);

	}

}
