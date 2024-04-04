package thisexample;

public class example2 {
	int age;
	double salary;

	example2() {
		this(10);
		System.out.println("zero param constructor");
	}

	example2(int num) {
		
		System.out.println("int param constructor");
		age = num;
	}

	example2(double sal) {
		this();
		System.out.println("double param constructor");
		salary = sal;
	}

	public static void main(String[] args) {
		example2 ref=new example2(23.34);
		System.out.println(ref.age);
		System.out.println(ref.salary);

	}

}
