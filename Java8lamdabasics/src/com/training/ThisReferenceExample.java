package com.training;

public class ThisReferenceExample {
	
	public void doProcess(int i,Process p) {
		p.process(i);
	}

	public static void main(String[] args) {

		ThisReferenceExample thre=new ThisReferenceExample();
		thre.doProcess(10,new Process() {
			
			@Override
			public void process(int i) {

				System.out.println("value of i = "+i);
				System.out.println(this);
			}
			
			public String toString() {
				return "Anonymous inner class";
			}
		});
	}

}
