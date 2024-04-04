package constructor;

public class constoverload {
	int age;
	double salary;

	constoverload() {
		System.out.println("zero param constructor");
	}

	constoverload(int num) {
		System.out.println("int param constructor");
		age = num;
	}

	constoverload(double sal) {
		System.out.println("double param constructor");
		salary = sal;
	}

	constoverload(int n1, double s1) {
		System.out.println("int double param constructor");
		age = n1;
		salary = s1;
	}

	public static void main(String[] args) {
		constoverload e4=new constoverload(25,34.32);
	      System.out.println("age with e4 ref: "+e4.age);
	      System.out.println("salary with e4 ref: "+e4.salary);
		constoverload e3 = new constoverload(25000.25);
		System.out.println("age with e3 ref: " + e3.age);
		System.out.println("salary with e3 ref: " + e3.salary);
		constoverload e1 = new constoverload();
		System.out.println("age with e1 ref: " + e1.age);
		System.out.println("salary with e1 ref: " + e1.salary);
		constoverload e2 = new constoverload(25);
		System.out.println("age with e2 ref: " + e2.age);
		System.out.println("salary with e2 ref: " + e2.salary);
	}
}
