package com.seed.RegEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExpDemo {

	public static void main(String[] args) {
	
		Pattern pattern = Pattern.compile("negative");
		Matcher matcher =
		//Positive Feedback
//	pattern.matcher("Positive feedback can "
//				+ "Positive"
//				+ " and create a Positive feedback loop.");
	//Negative Feedback	
		pattern.matcher("When someone gives you negative feedback,"
				+ " it can be an opportunity to negative and grow."
				+ " You can try to negative to what they have to say "
				+ "and see if there is anything you negative learn from it.");
		
		while(matcher.find()){
			System.out.println("Group: " + matcher.group());
		}
	}

}
