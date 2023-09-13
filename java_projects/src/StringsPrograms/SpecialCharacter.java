package StringsPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacter {

	public static void main(String[] args)
	{
//	Java Program to Check Whether the String Consists of Special Characters
		
		String s1 = "GeeksForGeeks";
		
		Pattern p = Pattern.compile (
		            "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		 
		        Matcher m = p.matcher(s1);
		 
		        boolean res = m.find();
		        if (res)
		            System.out.println(
		                "String1 contains Special Characters");
		        else
		 
		            // Display this message on the console
		            System.out.println(
		                "No Special Characters found in String 1");
		        
		     String s2 = "!!Geeks.For.Geeks##";
		        Matcher m2 = p.matcher(s2);
		        boolean res2 = m2.find();

		        if (res2)
		            System.out.println(
		                "String 2 contains Special Characters");
		 
		        else
		            System.out.println(
		                "No Special Characters found in String 2");
	}

}
