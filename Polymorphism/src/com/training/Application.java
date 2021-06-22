package com.training;
import com.training.ifaces.Converter;
import com.training.models.CurrencyConvertor;
import com.training.models.TemperatureConvertor;
import com.training.services.ConvertorService;
public class Application {

	public static void main(String[] args) {
       Converter tempConv =new TemperatureConvertor(-40.0);
       Converter currConv =new CurrencyConvertor(123);
       ConvertorService service=new ConvertorService();
       
       service.print(tempConv);
       service.print(currConv);
       
       int key=1;
       Converter convRef=service.getReference(key);
       if(convRef instanceof TemperatureConvertor)
       {
    	   TemperatureConvertor conv=(TemperatureConvertor)convRef;
    	   conv.setCelsius(-40.00);
       }
       if(convRef instanceof CurrencyConvertor)
       {
    	   CurrencyConvertor conv=(CurrencyConvertor)convRef;
    	   conv.setIndianRupee(100);
       }
       service.print(convRef);
	}

}
