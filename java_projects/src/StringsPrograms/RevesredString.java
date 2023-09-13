package StringsPrograms;

public class RevesredString {

	public static void main(String[] args) {
		  String s1 = "Hello World";    
	           
	        String reversedStr = "";    
	               
	        for(int i=s1.length()-1;i>=0; i--){    
	            reversedStr += s1.charAt(i);    
	        }    
	            
	        System.out.println("Original string: " + s1);    
	          
	        System.out.println("Reverse of given string: " + reversedStr);

	}

}
