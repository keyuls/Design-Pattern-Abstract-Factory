import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONObject;


public class main {
	
	 public static IReader getIReader(String country)
	 {
		if (country.equalsIgnoreCase("1"))
		{
			return new IReaderUk();
		}
		
		if (country.equalsIgnoreCase("2"))
		{
			return new IReaderUs();
		}
		 
		return null;
	 }

	 public static IMenuGenerator getIMenuGenerator(String menuType)
	 {
		if (menuType.equalsIgnoreCase("1"))
		{
			return new IMenuGeneratorDinner();
		}
		
		if (menuType.equalsIgnoreCase("2"))
		{
			return new IMenuGeneratorEveningOnly();
		}
		 
		if(menuType.equalsIgnoreCase("3"))
		{
			return new IMenuGeneratorAllDay();
		}	
		return null;
	 }
 
	 public static IMenuFormatter getIMenuFormmater(String menuFormat)
	 {
		if (menuFormat.equalsIgnoreCase("1"))
		{
			return new IMenuFormatterPlainText();
		}
		
		if (menuFormat.equalsIgnoreCase("2"))
		{
			return new IMenuFormatterHtml();
		}
		 
		if(menuFormat.equalsIgnoreCase("3"))
		{
			return new IMenuFormatterXml();
		}	
		return null;
	 }
 	 
	 
	public static void main(String[] args) {
		
		System.out.println("Press \n 1 for UK \n 2 for US \n");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		IReader ir = getIReader(s);
		createReader cr = ir.getReader();
		JSONObject al =cr.readFile();
		
		System.out.println("select Restaurant Catagory. Press \n 1 for Dinner \n 2 for Evening Only \n 3 for All Day \n");
		Scanner scan1 = new Scanner(System.in);
		String st = scan1.next();
		
		IMenuGenerator mg = getIMenuGenerator(st);
		createMenuCreator mc = mg.getMenu();
		JSONObject jc = mc.makeMenu(al);

		System.out.println("select Menu Format. Press \n 1 for PlainText \n 2 for Html \n 3 for Xml \n");
		Scanner scan2 = new Scanner(System.in);
		String std = scan.next();
		
		IMenuFormatter mf = getIMenuFormmater(std);
		createMenuFormatter mfo = mf.generateMenu();
		 mfo.displayMenu(jc);
		
		
	}

}
