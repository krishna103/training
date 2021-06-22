package com.training;

public class Closures {

	public static void main(String[] args) {

		int a=10;
		doProcess(a,new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i);
			}
		});
	}
	public static void doProcess(int i,Process p) {
		p.process(i);
	}

}
interface Process {
	void process(int i);
}
