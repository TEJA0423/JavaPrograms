package MethodsPrgrams;

public class Student {
	public static void main(String[] args) {
		
//		Write a java method to print data available in the Student object
	
		Student d = new Student();
		
		Students s = new Students();
		s.id = 1101;
		s.name = "Ramu";
		
		d.print(s);
	}

	void print(Students s) {
		System.out.println(s.id + " <------> " + s.name);
	}

}

class Students {
	int id;
	String name;
}


