package com.training.service;
import com.training.model.Invoice;
import java.io.*;

public class InvoiceService {
     private File file;

	public InvoiceService(File file) {
		super();
		this.file = file;
	}
     public boolean writeToFile(Invoice entity)
     {
    	 boolean result=false;
    	 try(ObjectOutputStream outStream=
    			 new ObjectOutputStream(new FileOutputStream(this.file));){
    		 outStream.writeObject(entity);
    		 result=true;
    	 }
    	 catch(IOException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return result;
     }
     public Invoice readToFile()
     {
    	 Invoice object=null;
    	 try(ObjectInputStream inStream=
    			 new ObjectInputStream(new FileInputStream(this.file));){
             object=(Invoice)inStream.readObject();
    	 }
    	 catch(IOException | ClassNotFoundException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return object;
     }
     public boolean writeToTextFile(Invoice entity)
     {
    	 boolean result=false;
    	 try(PrintWriter writer=new PrintWriter(new FileWriter(this.file, true))){
    		 writer.println(entity);
    		 result=true;
    	 }catch(IOException e){
    		 e.printStackTrace();
    	 }
    	 return result;
     }
     public Invoice[] readFromTextFile()
     {
    	 Invoice list[]=new Invoice[30];
			/*
			 * try { FileReader fr=new FileReader(this.file); BufferedReader br=new
			 * BufferedReader(fr); String line=null; try { while((line=br.readLine())!=null)
			 * { list+=line; } catch(IOException e) { e.printStackTrace(); } } }catch() {
			 * 
			 * };
			 */
    	 try(BufferedReader reader=new BufferedReader(new FileReader(this.file)))
    	 {
    		 String line=null;
    		 int i=0;
    		 while((line=reader.readLine())!=null)
    		 {
    			 String[] values=line.split(",");
    			 Invoice invoice=new Invoice(Integer.parseInt(values[0])
    					 ,values[1],Double.parseDouble(values[2]));
    			 list[i]=invoice;
    			 i++;
    		 }
    	 }
    	 catch(IOException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return list;
    	
     }
}
