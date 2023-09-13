package MethodsPrgrams;

public class ConvertSnakeCaseStringToCamelCase {

    public static void
        main(String[] args)
    {
        String str = "Hai_Hello_Welcome";
        
        str = snakeToCamel(str);
 
        System.out.println(str);
    }
	public static String snakeToCamel(String str)
    {

        str = str.substring(0, 1).toUpperCase()
              + str.substring(1);
 
        // Convert to StringBuilder
        StringBuilder builder = new StringBuilder(str);
 
        for (int i = 0; i < builder.length(); i++) {
 
            if (builder.charAt(i) == '_') {
 
                builder.deleteCharAt(i);
                builder.replace(
                    i, i + 1,
                    String.valueOf(
                        Character.toUpperCase(
                            builder.charAt(i))));
            }
        }
 
        return builder.toString();
    }
 
  

}
