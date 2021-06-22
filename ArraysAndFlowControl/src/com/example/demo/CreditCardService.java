package com.example.demo;

public class CreditCardService {
     private CreditCard[] cardList;
     private static int idxpos=0;

	public CreditCardService() {
		super();
		this.cardList=new CreditCard[5];
	}

	public CreditCard[] getCardList() {
		return cardList;
	}

	public void setCardList(CreditCard[] cardList) {
		this.cardList = cardList;
	}
    public boolean addCard(CreditCard card)
    {
    	boolean result;
    	if(idxpos<5) {
    	this.cardList[idxpos]=card;
    	idxpos++;
    	result=true;}else {
    		result=false;
    	}
    	return result;
    }
}
