
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;




public class createReaderUk implements createReader {

    
	@Override
	public JSONObject readFile() {
		System.out.println("UK");
		JSONObject jsonObject = null;
		JSONArray us = new JSONArray();
		JSONObject object = new JSONObject();

    
        DocumentBuilderFactory factory = 
            DocumentBuilderFactory.newInstance();

      
        DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();

        Document document;
		
			document = builder.parse(
			    ClassLoader.getSystemResourceAsStream("FoodItemData.xml"));
		


        List<details> foodList = new ArrayList<>();
      

     
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {

         
          Node node = nodeList.item(i);
          if (node instanceof Element) {
            details food = new details();
            food.country = node.getAttributes().
                getNamedItem("country").getNodeValue();

            NodeList childNodes = node.getChildNodes();
            for (int j = 0; j < childNodes.getLength(); j++) {
              Node cNode = childNodes.item(j);

             
              if (cNode instanceof Element) {
                String content = cNode.getLastChild().
                    getTextContent().trim();
                switch (cNode.getNodeName()) {
                
                  case "id":
                    food.id = content;
                    break;
                  case "name":
                    food.name = content;
                    break;
                  case "description":
                    food.description = content;
                    break;
                  case "category":
                      food.category = content;
                      break;
                  case "price":
                      food.price = content;
                      break;
                    
                }
              }
            }
            foodList.add(food);
          }

        }
        
	
			
		  Gson gson = new Gson();
	        String json = gson.toJson(foodList); 
	        String n = "-country";
	        String r = json.replaceAll("country", n);
	     
	          
	    		PrintWriter writer = new PrintWriter("File.json","UTF-8");
	    		writer.write("{\"FoodItemData\":");
	    		writer.write(r);
	    		writer.write("}");
	    		writer.close();
	     
			FileReader reader = new FileReader("..//Creational Pattern//File.json");

			JSONParser jsonParser = new JSONParser();
			 jsonObject = (JSONObject) jsonParser.parse(reader);

			

			
			JSONArray lang= (JSONArray) jsonObject.get("FoodItemData");
			Iterator i = lang.iterator();

		
			while (i.hasNext()) {
				
				
				JSONObject innerObj = (JSONObject) i.next();
				if(innerObj.get("-country").equals("GB"))
				{	
					us.add(innerObj);
				}
				
				} 
			
			
			 object.put("FoodItemData", us);
			 
		
		}	
	
		catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    	catch (ParserConfigurationException e) {
	    		
	    		e.printStackTrace();
	    	} 
	    	catch (SAXException e) {
	    		
	    		e.printStackTrace();
	    	} 
catch (org.json.simple.parser.ParseException e) {
			
			e.printStackTrace();
		}
		return object;
			}
		 
}
