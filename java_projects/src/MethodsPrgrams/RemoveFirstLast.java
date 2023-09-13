package MethodsPrgrams;

public class RemoveFirstLast {
	
//	public static void main(String args[])
//    {
//        String str = "Hello World";
//        
//        System.out.print(
//        		
//        removeFirstandLast(str));
//    }
//
//	 public static String removeFirstandLast(String str)
//	    {
//	        str = str.substring(1, str.length() - 1);
//	        
//	        return str;
//	    }
	 
	  public static void main(String args[])
	    {
	        String str = "Welcome To Vtalent";
	 
	        System.out.println(
	        		
	        removeFirstandLast(str));
	    }
	 
	 
	 public static String removeFirstandLast(String str)
	    {
	        StringBuilder sb = new StringBuilder(str);
	        
	        sb.deleteCharAt(str.length() - 1);

	        sb.deleteCharAt(0);

	        return sb.toString();
	    }
	 
	
	  
	   
}
