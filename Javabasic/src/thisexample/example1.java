package thisexample;

public class example1 {
	int age=25;
	void display() {//method
		System.out.println("Age: "+age);
	}
	void display(int age) {//method
		System.out.println("I m display(int)");
		System.out.println("Age: "+age);
		//example1 e2=new example1();
		//System.out.println("NSGV: "+e2.age);
		System.out.println("Nsgv: "+age);
		System.out.println("thisvalue: "+this);
		this.calling();
	}
	void calling() {//NSmethod
		System.out.println("I am calling");
	}

	public static void main(String[] args) {
		example1 e1=new example1();
		e1.display();
		e1.display(13);
		

	}

}
