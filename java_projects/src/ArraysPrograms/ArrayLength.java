package ArraysPrograms;

public class ArrayLength {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50,60,70,80,90};
		System.out.println("the length of the given Array = "+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("**********");
		
		
		int a [][]= {{20,10},{60,30},{70,40}};
		
		     System.out.println("The length of the given Arrays: ");
			System.out.println("a[0] length =" + a[0].length);
			System.out.println("a[1] length =" + a[0].length);
			System.out.println("a[2] length =" + a[0].length);	
		
	}

}
