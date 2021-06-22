package com.training;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.services.UsePrintService;

public class ApplicationForSync {

	public static void main(String[] args) {

//		new UsePrintService("idli", "Sambhar");
//		new UsePrintService("pizza", "coke");
//		new UsePrintService("poori", "Sagoo");
//		new UsePrintService("parantha", "Dahi");
		
		ExecutorService service=Executors.newSingleThreadExecutor();
		service.execute(new UsePrintService("idli", "Sambhar"));
		service.execute(new UsePrintService("pizza", "coke"));
		service.execute(new UsePrintService("poori", "Sagoo"));
		service.execute(new UsePrintService("parantha", "Dahi"));


	}

}
