import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class createReaderUs implements createReader{

	@Override
	public JSONObject readFile() {
		
		System.out.println("US");
		JSONObject jsonObject = null;
		JSONArray us = new JSONArray();
		JSONObject obj = new JSONObject();
		
		try {
			
			FileReader reader = new FileReader("..\\Creational Pattern\\src\\FoodItemData.json");

			JSONParser jsonParser = new JSONParser();
			 jsonObject = (JSONObject) jsonParser.parse(reader);

			

			
			JSONArray lang= (JSONArray) jsonObject.get("FoodItemData");
			Iterator i = lang.iterator();

			
			while (i.hasNext()) {
				
				
				JSONObject innerObj = (JSONObject) i.next();
				if(innerObj.get("-country").equals("US"))
				{	
					us.add(innerObj);
				}
				
				} 
			
			
			 obj.put("FoodItemData", us);
			 
		
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			
			e.printStackTrace();
		}
				return obj;
	
	}
	

}
