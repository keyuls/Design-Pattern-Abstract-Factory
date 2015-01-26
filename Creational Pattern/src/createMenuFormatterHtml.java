import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class createMenuFormatterHtml implements createMenuFormatter {

	@Override
	public void displayMenu(JSONObject jc) {
		
		
		PrintWriter writer;
		int b=0,a=0,s=0,l=0,sd=0,d=0,dt=0;
		String currency = "GBP";
		String usCurr = "$";
		try {
		writer = new PrintWriter("HTML-Menu.html", "UTF-8");
		writer.println("<HTML><HEAD><TITLE>Menu</TITLE></HEAD>");	
		writer.println(" <BODY><CENTER>Menu</CENTER>");
					
		
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
		writer.println(" ");	
		writer.println("<H1> &nbsp; &nbsp;  BREAKFAST</H1>");
		writer.println(" <UL>");
		}
		while (it.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it.next();
			if(innerObj2.get("category").equals("Breakfast"))
			{	
				
				writer.println("<LI>"+innerObj2.get("name").toString()+" <BR><I>"+innerObj2.get("description").toString()+"</I><BR>" +currency+ innerObj2.get("price").toString()+"</LI>" );
								writer.println(" ");
			}
			
		}
		
		if(s>0)
		{	
		writer.println("<H1>SNACKS</H1>");
		writer.println(" ");
		}
		Iterator it2 = lang2.iterator();
		while (it2.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it2.next();
			if(innerObj2.get("category").equals("Snack"))
			{				
			writer.println("<LI>"+innerObj2.get("name").toString()+" <BR><I>"+innerObj2.get("description").toString()+"</I><BR>" +currency+ innerObj2.get("price").toString()+"</LI>" );
								writer.println(" ");
			}
			
		}

		if(a>0)
		{	
		writer.println("<H1>APPETIZER</H1>");
		writer.println(" ");
		}
		Iterator it3 = lang2.iterator();
		while (it3.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it3.next();
			if(innerObj2.get("category").equals("Appetizer"))
			{	
			
				writer.println("<LI>"+innerObj2.get("name").toString()+" <BR><I>"+innerObj2.get("description").toString()+"</I><BR>" +currency+ innerObj2.get("price").toString()+"</LI>" );
				
				writer.println(" ");
			}
			
		}
		
		if(l>0)
		{	
		writer.println("<H1>LUNCH</H1>");
		writer.println(" ");
		
		Iterator it4 = lang2.iterator();
		while (it4.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it4.next();
			if(innerObj2.get("category").equals("Lunch"))
			{	
				writer.println("<LI>"+innerObj2.get("name").toString()+" <BR><I>"+innerObj2.get("description").toString()+"</I><BR>" +currency+ innerObj2.get("price").toString()+"</LI>" );
				writer.println(" ");
			}
			
		}
	  }
		
		if(d>0)
		{	
		writer.println("<H1>DINNER</H1>");
		writer.println(" ");
		}
		Iterator it5 = lang2.iterator();
		while (it5.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it5.next();
			if(innerObj2.get("category").equals("Dinner"))
			{	
			
				
				writer.println("<LI>"+innerObj2.get("name").toString()+" <BR><I>"+innerObj2.get("description").toString()+"</I><BR>" +currency+ innerObj2.get("price").toString()+"</LI>" );
				writer.println(" ");
			}
			
		}

		if(dt>0)
		{	
		writer.println("<H1>DESSERT</H1>");
		writer.println(" ");
		}
		Iterator it6 = lang2.iterator();
		while (it6.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it6.next();
			if(innerObj2.get("category").equals("Dessert"))
			{	
				writer.println("<LI>"+innerObj2.get("name").toString()+" <BR><I>"+innerObj2.get("description").toString()+"</I><BR>" +currency+ innerObj2.get("price").toString()+"</LI>" );
				writer.println(" ");
			}
			
		}
		
		if(sd>0)
		{	
		writer.println("<H1>SIDE DISH</H1>");
		writer.println(" ");
		}
		Iterator it7 = lang2.iterator();
		while (it7.hasNext()) {
			
			JSONObject innerObj2 = (JSONObject) it7.next();
			if(innerObj2.get("category").equals("Side Dish"))
			{	
				writer.println("<LI>"+innerObj2.get("name").toString()+" <BR><I>"+innerObj2.get("description").toString()+"</I><BR>" +currency+ innerObj2.get("price").toString()+"</LI>" );
				writer.println(" ");
			}
			
		}
		writer.println("</UL></BODY></HTML>");
		writer.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
		
			e.printStackTrace();
		}


		
	}

}
