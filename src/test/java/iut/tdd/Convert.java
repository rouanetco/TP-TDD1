package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	
	static HashMap<String, String> liste = new HashMap<String, String>();
	static {
			liste.put("0", "zéro");
			liste.put("1","un");
			liste.put("2","deux");
			liste.put("3","trois");
			liste.put("4","quatre");
			liste.put("5", "cinq");
			liste.put("6","six");
			liste.put("7","sept");
			liste.put("8", "huit");
			liste.put("9", "neuf");
			liste.put("10", "dix");
			liste.put("11", "onze");
			liste.put("12", "douze");
			liste.put("13", "treize");
			liste.put("14","quatorze");
			liste.put("15", "quinze");
			liste.put("16", "seize");
							
	}
	public static String num2text(String input) {
		return (liste.get(input));
		 
	}
	public static String text2num(String input) {
		return null;
	}
}