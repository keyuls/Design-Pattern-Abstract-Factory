import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class createMenuCreatorDinner implements createMenuCreator {
	
	public JSONObject makeMenu(JSONObject al)
	{
		
		JSONArray lang= (JSONArray) al.get("FoodItemData");
		Iterator i = lang.iterator();
		JSONArray bf = new JSONArray();
	
	while (i.hasNext()) {
		
		
		JSONObject innerObj = (JSONObject) i.next();
			if( innerObj.get("category").equals("Breakfast"))	
			{
			bf.add(innerObj);
			}
			
			else if( innerObj.get("category").equals("Snack"))	
			{
			bf.add(innerObj);
			}
			
			else if( innerObj.get("category").equals("Appetizer"))	
			{
			bf.add(innerObj);
			}
			else if( innerObj.get("category").equals("Lunch"))	
			{
			bf.add(innerObj);
			}
			else if( innerObj.get("category").equals("Dessert"))	
			{
			bf.add(innerObj);
			}
	}
			
	
	 JSONObject object = new JSONObject();
	 object.put("menu", bf);
	
	 
	
	return object;
	
	
	}
	
	}
