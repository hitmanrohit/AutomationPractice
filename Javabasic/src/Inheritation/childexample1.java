package Inheritation;
class parent{
	int age=34;
	static double growth=25.23;
}

public class childexample1 extends parent{
	int planet=9;
	static char name='A';
	
	public static void main(String[] args) {
		childexample1 c1= new childexample1();
		System.out.println("*******Child's variables");
		System.out.println("NSGV: "+c1.planet);
		System.out.println("SGV: "+childexample1.name);
		System.out.println("*******Parent's variables");
		System.out.println("NSGV: "+c1.age);
		System.out.println("SGV: "+childexample1.growth);

	}

}
