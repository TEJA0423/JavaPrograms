package AssignmentPrograms;

public class FactorialNumber {

	public static void main(String[] args) {

//        int num = 10;
//        long factorial = 1;
//        for(int i = 1; i <= num; ++i)
//        {
//            // factorial = factorial * i;
//            factorial *= i;
//        }
//        
        int num = 10, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d=%d", num, factorial);

	}

}
