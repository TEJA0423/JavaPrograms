package StringsPrograms;

public class PalindromicSub_StringsofAString {

	 public static boolean check(String subS)
	    {
	        int size = subS.length();
	 
	        for (int i = 0; i < size / 2; i++) {
	 
	            if (subS.charAt(i)
	                != subS.charAt(size - i - 1)) {
	                return false;
	            }
	        }
	
	        return true;
	    }

	    public static void main(String[] args)
	    {
	        String str = "MALAYALAM";
	 
	        int count = 0;
	 
	        for (int i = 0; i < str.length(); i++) {

	            for (int j = i; j < str.length(); j++) {
	 
	                String subString = str.substring(i, j + 1);
	
	                if (check(subString)) {
	                    count++;
	                }
	            }
	        }

	        System.out.println(
	            "No.of palindromic substrings in the given string are "
	            + count);
	    }

}
