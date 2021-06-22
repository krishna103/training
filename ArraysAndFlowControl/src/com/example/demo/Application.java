package com.example.demo;

public class Application {

	public static void main(String[] args) {
		CreditCardService service=new CreditCardService();
		try{
		CreditCard card1= new CreditCard(101,"Ramesh",10000.00);
		CreditCard card2= new CreditCard(102,"Rmesh", 20000.00);
		CreditCard card3= new CreditCard(103,"Raesh", 30000.00);
		CreditCard card4= new CreditCard(104,"Rameh", 40000.00);
		CreditCard card5= new CreditCard(105,"Rames", 50000.00);

		service.addCard(card1);
		service.addCard(card2);
		service.addCard(card3);
		service.addCard(card4);
		service.addCard(card5);

		  boolean r1=service.addCard(card5);
		  boolean r2=service.addCard(card5);
		  
		  System.out.println(r1+" "+r2);

 
		CreditCard[] cardlist=service.getCardList();
		for(CreditCard eachCard:cardlist)
		{
			if(eachCard!=null) {
			System.out.println(eachCard.getCardHolderName());
			}
		}
		}
	    catch (Exception e) {
	    	System.err.println(e.getMessage());
	    }
		
		CreditCard card6=new CreditCard();
		card6.setCardHolderName("Manish");
		card6.setCardNumber(34343);
		try {
			card6.setCreditLimit(500000);
		} catch (Exception e) {
            e.printStackTrace();
		}
		
		String name="Ramesh";
		System.out.println(UsingFinallyBlock.getMessage(name));
		String name1=null;
		System.out.println(UsingFinallyBlock.getMessage(name1));	
	}

}
