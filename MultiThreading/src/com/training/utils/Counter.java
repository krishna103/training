package com.training.utils;

public class Counter implements Runnable {

	@Override
	public void run() {
        System.out.println(Thread.currentThread().getName());
	}

}
