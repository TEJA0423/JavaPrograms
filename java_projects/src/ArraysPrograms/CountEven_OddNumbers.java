package ArraysPrograms;

public class CountEven_OddNumbers {

	public static void main(String[] args)  {
		int a[]= {2,5,4,3,6,48,65,91,83,74};
	    System.out.println("Odd Numbers :");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		
		System.out.println("Even Numbers : ");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
