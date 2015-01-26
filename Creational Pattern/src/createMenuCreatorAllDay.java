import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class createMenuCreatorAllDay implements createMenuCreator {

	@Override
	public JSONObject makeMenu(JSONObject al) {
		JSONArray lang= (JSONArray) al.get("FoodItemData");
		Iterator i = lang.iterator();
		JSONArray ad = new JSONArray();
	
	while (i.hasNext()) {
		
		
		JSONObject innerObj = (JSONObject) i.next();
			if( innerObj.get("category").equals("Breakfast"))	
			{
			ad.add(innerObj);
			}
			
			else if( innerObj.get("category").equals("Snack"))	
			{
			ad.add(innerObj);
			}
			
			else if( innerObj.get("category").equals("Appetizer"))	
			{
			ad.add(innerObj);
			}
			else if( innerObj.get("category").equals("Lunch"))	
			{
			ad.add(innerObj);
			}
			else if( innerObj.get("category").equals("Dinner"))	
			{
			ad.add(innerObj);
			}
			else if( innerObj.get("category").equals("Dessert"))	
			{
			ad.add(innerObj);
			}
			else if( innerObj.get("category").equals("Side Dish"))	
			{
			ad.add(innerObj);
			}

	}
			
	
	 JSONObject object = new JSONObject();
	 object.put("menu", ad);
	
	 
	
	return object;
		
	}

	

}
