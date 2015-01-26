import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class createMenuFormatterPlainText implements createMenuFormatter {

	@Override
	public void displayMenu(JSONObject jc) {
		PrintWriter writer;
		int b=0,a=0,s=0,l=0,sd=0,d=0,dt=0;
		String currency = "GBP";
		String usCurr = "$";
		try {
		writer = new PrintWriter("Plain Text-Menu.txt", "UTF-8");
		writer.println("Menu \n");	
		writer.println(" ");
					
		
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
		writer.println("BREAKFAST");
		writer.println(" ");
		}
		while (it.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it.next();
			if(innerObj2.get("category").equals("Breakfast"))
			{	
						
				writer.println(innerObj2.get("name").toString()+" \t \t \t \t \t" +currency+ innerObj2.get("price").toString() );
				writer.println(innerObj2.get("description").toString() + "\n \n");
				writer.println(" ");
			}
			
		}
		
		if(s>0)
		{	
		writer.println("SNACKS");
		writer.println(" ");
		}
		Iterator it2 = lang2.iterator();
		while (it2.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it2.next();
			if(innerObj2.get("category").equals("Snack"))
			{						
					writer.println(innerObj2.get("name").toString()+" \t \t \t \t \t" +currency+ innerObj2.get("price").toString() );
					writer.println(innerObj2.get("description").toString() + "\n \n");
					writer.println(" ");
			}
			
		}

		if(a>0)
		{	
		writer.println("APPETIZER");
		writer.println(" ");
		}
		Iterator it3 = lang2.iterator();
		while (it3.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it3.next();
			if(innerObj2.get("category").equals("Appetizer"))
			{			
				writer.println(innerObj2.get("name").toString()+" \t \t \t \t \t" + currency+ innerObj2.get("price").toString() );
				writer.println(innerObj2.get("description").toString() + "\n \n");
				writer.println(" ");
			}
			
		}
		
		if(l>0)
		{	
		writer.println("LUNCH");
		writer.println(" ");
		}
		Iterator it4 = lang2.iterator();
		while (it4.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it4.next();
			if(innerObj2.get("category").equals("Lunch"))
			{	
				writer.println(innerObj2.get("name").toString()+" \t \t \t \t \t" +currency+ innerObj2.get("price").toString() );
				writer.println(innerObj2.get("description").toString() + "\n \n");
				writer.println(" ");
			}
			
		}
		
		if(d>0)
		{	
		writer.println("DINNER");
		writer.println(" ");
		}
		Iterator it5 = lang2.iterator();
		while (it5.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it5.next();
			if(innerObj2.get("category").equals("Dinner"))
			{	
				writer.println(innerObj2.get("name").toString()+" \t \t \t \t \t" +currency+ innerObj2.get("price").toString() );
				writer.println(innerObj2.get("description").toString() + "\n \n");
				writer.println(" ");
			}
			
		}

		if(dt>0)
		{	
		writer.println("DESSERT");
		writer.println(" ");
		}
		Iterator it6 = lang2.iterator();
		while (it6.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it6.next();
			if(innerObj2.get("category").equals("Dessert"))
			{	
				writer.println(innerObj2.get("name").toString()+" \t \t \t \t \t" +currency+ innerObj2.get("price").toString() );
				writer.println(innerObj2.get("description").toString() + "\n \n");
				writer.println(" ");
			}
			
		}
		
		if(sd>0)
		{	
		writer.println("SIDE DISH");
		writer.println(" ");
		}
		Iterator it7 = lang2.iterator();
		while (it7.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it7.next();
			if(innerObj2.get("category").equals("Side Dish"))
			{	
				writer.println(innerObj2.get("name").toString()+" \t \t \t \t \t" +currency+ innerObj2.get("price").toString() );
				writer.println(innerObj2.get("description").toString() + "\n \n");
				writer.println(" ");
			}
			
		}
		writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
