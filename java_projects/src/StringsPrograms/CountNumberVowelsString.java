package StringsPrograms;

public class CountNumberVowelsString {

	public static void main(String[] args) {
		 String str = "GeeksForGeeks";
	        str = str.toLowerCase();
	        int count = 0;
	 
	        for (int i = 0; i < str.length(); i++) {
	            // check if char[i] is vowel
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
	      
	                count++;
	            }
	        }
	        System.out.println(
	            "Total no of vowels in string are: " + count);
	    }

	}


