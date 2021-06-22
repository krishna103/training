package com.example.demo;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
    Logger log = Logger.getRootLogger();
    System.out.println( "Hello World!" );
    Calculator calc = new Calculator();
    System.out.println("Values :="+calc.calculate("45","55"));
    Author authorSathish =new Author("Satish","Reddy","sat@abc.com");
    Book headFirst = new Book(899, "Head First Java", authorSathish, 450.00);

    Gson gson = new Gson();
    log.info("converting to json");

    String jsonFormat = gson.toJson(headFirst);
    System.out.println(jsonFormat);
    }
}
