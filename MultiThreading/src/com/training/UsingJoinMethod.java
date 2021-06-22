package com.training;

import java.io.IOException;

public class UsingJoinMethod {

	public static void main(String[] args) {
        System.out.println("Main Starting");
        
        Thread thread=new Thread() {
        	public void run() {
        		System.out.println("Reading");
        		try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
        		System.out.println("Finished Reading");
        	}
            
        };
        thread.start();
        try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("Main End");

	}

}
