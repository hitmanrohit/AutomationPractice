package polymorph;
class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
}
class herbivorus extends Animal{
	void eat() {
		System.out.println("herbis eat plants");
	}
}
class carnivorus extends Animal{
	void eat() {
		System.out.println("carnis eat meat");
	}
}
class omnivorus extends Animal{
	void eat() {
		System.out.println("omnis eat plants and meat.");
	}
}
public class Runtime {
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal h=new herbivorus();
		Animal c= new carnivorus();
		Animal o=new omnivorus();
		a.eat();
		h.eat();
		c.eat();
		o.eat();
		
	}

}
