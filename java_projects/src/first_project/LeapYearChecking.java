package first_project;

public class LeapYearChecking {

	public static void main(String[] args) {
	
		int year =2400;
		if(year%400==0) {
		System.out.println("Leap year");
		}else if (year%400==0 && year%100!=0)
			{
				System.out.println("Leap year");		
	      	}else {
			System.out.println("Not a Leap year");
		}
	
			
		
	}

}
