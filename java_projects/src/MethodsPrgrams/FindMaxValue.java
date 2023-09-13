package MethodsPrgrams;

public class FindMaxValue {

	int Max(int a, int b) {
		if(a>b) {
			return a;	
		}
		return b;
	}
	public static void main(String[] args) {
		
		FindMaxValue  m1 = new FindMaxValue();
		int c = m1.Max(25, 12);
		System.out.println("maximum value is : "+ c);
	}
	
}
