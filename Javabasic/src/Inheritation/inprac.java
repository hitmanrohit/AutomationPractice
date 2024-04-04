package Inheritation;
class parent1{
	static int age=23;
	static double salary=4.44d;
	void Bap() {
		System.out.println("I am bap");
	}
}
class child extends parent1{
	static int num=56;
	void beta() {
		System.out.println("I am beta.");
	}
}
public class inprac extends parent1{
	void pota() {
		System.out.println("I am pota.");
	}
	
	public static void main(String[] args) {
		
//		inprac i= new inprac();
//		i.pota();
//		i.beta();
//		i.Bap();
//		child c= new child();
//		c.beta();
//		c.Bap();
		parent1 p= new inprac();
		p.Bap();
		inprac i1=(inprac) p;
		i1.Bap();
//		i1.beta();
		i1.pota();
		System.out.println(parent1.age);
		System.out.println(child.num);

	}

}
