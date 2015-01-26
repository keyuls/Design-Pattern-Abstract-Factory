import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class createMenuCreatorEveningOnly implements createMenuCreator{

	@Override
	public JSONObject makeMenu(JSONObject al) {
		JSONArray lang= (JSONArray) al.get("FoodItemData");
		Iterator i = lang.iterator();
		JSONArray eo = new JSONArray();
	
	while (i.hasNext()) {
		
		
		JSONObject innerObj = (JSONObject) i.next();
			if( innerObj.get("category").equals("Appetizer"))	
			{
			eo.add(innerObj);
			}
			
			else if( innerObj.get("category").equals("Dinner"))	
			{
			eo.add(innerObj);
			}
			
			else if( innerObj.get("category").equals("Dessert"))	
			{
			eo.add(innerObj);
			}
			else if( innerObj.get("category").equals("Side Dish"))	
			{
			eo.add(innerObj);
			}
			
	}
			
	
	 JSONObject object = new JSONObject();
	 object.put("menu", eo);
	
	 
	
	return object;

	}

	
	

}
