package StringsPrograms;
import java.io.*;
public class ConvertOutputStreamString {

	public static void main(String[] args) throws Exception {
		 ByteArrayOutputStream stream
         = new ByteArrayOutputStream();

     // Initializing string
     String st = "Hello World!";

     // writing the specified byte to the output stream
     stream.write(st.getBytes());

     // converting stream to byte array
     // and typecasting into string
     String finalString
         = new String(stream.toByteArray());

     // printing the final string
     System.out.println(finalString);

	}

}
