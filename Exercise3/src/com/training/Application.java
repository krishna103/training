package com.training;
public class Application {

	public static void main(String[] args) {
        RentServ rentService=new RentServ(1001);
        items r1=new Computer("Speaker", 300, 3, "black");
        rentService.addToCart(r1);
        rentService.getPrice();
	}

}
