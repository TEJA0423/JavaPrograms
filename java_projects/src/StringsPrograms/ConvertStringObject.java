package StringsPrograms;

public class ConvertStringObject {

	public static void main(String[] args) {
		 String s = "Hello World!";
	        Object object = s;
	 
	       System.out.println("Datatype of the variable in object is : "
	                          +object.getClass().getName());
	        
	       System.out.println("object is : "+object);

	}

}
