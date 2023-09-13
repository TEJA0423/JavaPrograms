package MethodsPrgrams;

public class ThousandsSeparatorGivenNumber {

    static String thousandSeparator(int n, String ch)
    {
  
        // Counting number of digits
        int l = (int)Math.floor(Math.log10(n)) + 1;
        StringBuffer str = new StringBuffer("");
        int count = 0;
        int r = 0;
  
        // Checking if number of digits is greater than 3
        if (l > 3) {
  
            for (int i = l - 1; i >= 0; i--) {
  
                r = n % 10;
                n = n / 10;
                count++;
                if (((count % 3) == 0) && (i != 0)) {
  
                    // Parsing String value of Integer
                    str.append(String.valueOf(r));
  
                    // Appending the separator
                    str.append(ch);
                }
                else
                    str.append(String.valueOf(r));
            }
            str.reverse();
        }
     // If digits less than equal to 3, directly print n
        else
            str.append(String.valueOf(n));
  
        return str.toString();
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        int n = 123456789;
        String ch = ".";
        System.out.println(thousandSeparator(n, ch));
    }

}
