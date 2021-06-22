package com.training;

public class RentServ {
     private double totalPrice=0.00;
     private Integer itemCount=1;
     protected final int custId;
     
     public RentServ(int id)
     {
    	 this.custId=id;
    	 System.out.println("Cust ID "+id+"\n");
     }
     public void addToCart(items r)
     {
    	 System.out.println(itemCount+" : "+r.getItemName()+" added to cart from category "+r.getClass().getSimpleName() );
    	 if(r instanceof Computer)
    	 {
    		 Computer c1=(Computer)r;
    		 System.out.println(c1.toString());
    	 }
    	 else {
    		 System.out.println(r.toString());
    	 }
    	 totalPrice+=r.getItemprice()*r.getItemQuantity();
    	 itemCount++;
    	 System.out.println();
     }
     public void getPrice(){
    	 System.out.println("your total amount is: "+this.totalPrice);
     }
}
