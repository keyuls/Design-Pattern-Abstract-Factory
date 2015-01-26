import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class createMenuFormatterXml implements createMenuFormatter {

	@Override
	public void displayMenu(JSONObject jc) {
		
		PrintWriter writer;
		int b=0,a=0,s=0,l=0,sd=0,d=0,dt=0;
		String currency = "GBP";
		String usCurr = "USD";
		try {
		writer = new PrintWriter("XML-Menu.xml", "UTF-8");
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");	
		writer.println("<MenuItems> ");
					
		
		JSONArray lang2= (JSONArray)jc.get("menu");
		
		Iterator it0 = lang2.iterator();		
		
		while (it0.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it0.next();
			if(innerObj2.get("-country").equals("US"))
			{	
				currency= new String(usCurr);
			}
			
			if(innerObj2.get("category").equals("Breakfast"))
			{	
				b++;
			}
			if(innerObj2.get("category").equals("Snack"))
			{	
				s++;
			}
			if(innerObj2.get("category").equals("Appetizer"))
			{	
				a++;
			}
			if(innerObj2.get("category").equals("Lunch"))
			{	
				l++;
			}
			if(innerObj2.get("category").equals("Dinner"))
			{	
				d++;
			}
			if(innerObj2.get("category").equals("Dessert"))
			{	
				dt++;
			}
			if(innerObj2.get("category").equals("Side Dish"))
			{	
				sd++;
			}
}
		
		
		Iterator it = lang2.iterator();
		
		if(b>0)
		{	
		writer.println("<MenuCategory category=\"BREAKFAST\">");
		
		
		while (it.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it.next();
			if(innerObj2.get("category").equals("Breakfast"))
			{	
				writer.println("<MenuItem>");		
				writer.println("<Name>"+innerObj2.get("name").toString()+" </Name>" );
				writer.println("<Price>");
				
				writer.println("<CurrencyCode>" + currency + "</CurrencyCode>");
				
				writer.println("<Amount>"+ innerObj2.get("price").toString()+"</Amount>" );
				writer.println("</Price>");
				
				writer.println("<Description>"+innerObj2.get("description").toString() + "</Description>");
				writer.println("</MenuItem>");
			}
		}
		writer.println("</MenuCategory>");
		
	}
		
		if(s>0)
		{	
		
			writer.println("<MenuCategory category=\"SNACK\">");
		Iterator it2 = lang2.iterator();
		while (it2.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it2.next();
			if(innerObj2.get("category").equals("Snack"))
			{						
				writer.println("<MenuItem>");		
				writer.println("<Name>"+innerObj2.get("name").toString()+" </Name>" );
				writer.println("<Price>");
				
				writer.println("<CurrencyCode>" + currency + "</CurrencyCode>");
				
				writer.println("<Amount>"+ innerObj2.get("price").toString()+"</Amount>" );
				writer.println("</Price>");
				
				writer.println("<Description>"+innerObj2.get("description").toString() + "</Description>");
				writer.println("</MenuItem>");		
				}
		}
		writer.println("</MenuCategory>");
	 }

		if(a>0)
		{	

		writer.println("<MenuCategory category=\"APPETIZER\">");
		
		Iterator it3 = lang2.iterator();
		while (it3.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it3.next();
			if(innerObj2.get("category").equals("Appetizer"))
			{			
				writer.println("<MenuItem>");		
				writer.println("<Name>"+innerObj2.get("name").toString()+" </Name>" );
				writer.println("<Price>");
				
				writer.println("<CurrencyCode>" + currency + "</CurrencyCode>");
				
				writer.println("<Amount>"+ innerObj2.get("price").toString()+"</Amount>" );
				writer.println("</Price>");
				
				writer.println("<Description>"+innerObj2.get("description").toString() + "</Description>");
				writer.println("</MenuItem>");			}
			
		}
		writer.println("</MenuCategory>");
		}
		
		if(l>0)
		{	
		
		writer.println("<MenuCategory category=\"LUNCH\">");
		
		Iterator it4 = lang2.iterator();
		while (it4.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it4.next();
			if(innerObj2.get("category").equals("Lunch"))
			{	
				writer.println("<MenuItem>");		
				writer.println("<Name>"+innerObj2.get("name").toString()+" </Name>" );
				writer.println("<Price>");
				
				writer.println("<CurrencyCode>" + currency + "</CurrencyCode>");
				
				writer.println("<Amount>"+ innerObj2.get("price").toString()+"</Amount>" );
				writer.println("</Price>");
				
				writer.println("<Description>"+innerObj2.get("description").toString() + "</Description>");
				writer.println("</MenuItem>");			}
			}	
		writer.println("</MenuCategory>");
		}
		
		if(d>0)
		{	
	
		writer.println("<MenuCategory category=\"DINNER\">");
		
		Iterator it5 = lang2.iterator();
		while (it5.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it5.next();
			if(innerObj2.get("category").equals("Dinner"))
			{	
				writer.println("<MenuItem>");		
				writer.println("<Name>"+innerObj2.get("name").toString()+" </Name>" );
				writer.println("<Price>");
				
				writer.println("<CurrencyCode>" + currency + "</CurrencyCode>");
				
				writer.println("<Amount>"+ innerObj2.get("price").toString()+"</Amount>" );
				writer.println("</Price>");
				
				writer.println("<Description>"+innerObj2.get("description").toString() + "</Description>");
				writer.println("</MenuItem>");			}
			
		}
		writer.println("</MenuCategory>");
		}
		
		
		if(dt>0)
		{	
		
		writer.println("<MenuCategory category=\"DESSERT\">");
		
		Iterator it6 = lang2.iterator();
		while (it6.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it6.next();
			if(innerObj2.get("category").equals("Dessert"))
			{	
				writer.println("<MenuItem>");		
				writer.println("<Name>"+innerObj2.get("name").toString()+" </Name>" );
				writer.println("<Price>");
				
				writer.println("<CurrencyCode>" + currency + "</CurrencyCode>");
				
				writer.println("<Amount>"+ innerObj2.get("price").toString()+"</Amount>" );
				writer.println("</Price>");
				
				writer.println("<Description>"+innerObj2.get("description").toString() + "</Description>");
				writer.println("</MenuItem>");			}
			
		}
		writer.println("</MenuCategory>");
		}
		
		if(sd>0)
		{	
	
		writer.println("<MenuCategory category=\"SIDE_DISH\">");
		
		Iterator it7 = lang2.iterator();
		while (it7.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it7.next();
			if(innerObj2.get("category").equals("Side Dish"))
			{	
				writer.println("<MenuItem>");		
				writer.println("<Name>"+innerObj2.get("name").toString()+" </Name>" );
				writer.println("<Price>");
				
				writer.println("<CurrencyCode>" + currency + "</CurrencyCode>");
				
				writer.println("<Amount>"+ innerObj2.get("price").toString()+"</Amount>" );
				writer.println("</Price>");
				
				writer.println("<Description>"+innerObj2.get("description").toString() + "</Description>");
				writer.println("</MenuItem>");			}
			
		}
		writer.println("</MenuCategory>");
		}
		writer.println("</MenuItems>");
		writer.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
		
			e.printStackTrace();
		}


		
	}

}
