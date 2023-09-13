package MethodsPrgrams;

public class Persons {

	int id;
	String name;

	Persons[] m2() {

		Persons p1 = new Persons();
		p1.id = 101;
		p1.name = "Ramu";

		Persons p2 = new Persons();
		p2.id = 102;
		p2.name = "Teju";

		Persons p3 = new Persons();
		p3.id = 103;
		p3.name = "Kalyan";

		Persons[] arr = { p1, p2, p3 };

		return arr;

	}

	void m1(Persons p1, Persons p2) {
		System.out.println(p1.id + "--" + p1.name);
		System.out.println(p2.id + "--" + p2.name);
	}

	public static void main(String[] args) {
		Persons p = new Persons(); // obj1 created

		Persons p1 = new Persons(); // obj2 created
		p1.id = 101;
		p1.name = "Ramu";

		Persons p2 = new Persons(); // obj3 created
		p2.id = 102;
		p2.name = "Teju";

		p.m1(p1, p2);

		Persons[] arr = p.m2();

		for (Persons person : arr) {
			System.out.println(person.id + "--" + person.name);
		}

	}

}
