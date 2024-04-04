package typecast;
class Grandparents{
	void myhome() {
		System.out.println("myhome method is called.");
	}
}
class parents extends Grandparents{
	void show() {
		System.out.println("show method is called.");
	}
}
class child extends parents{
	void readme() {
		System.out.println("readme method is called.");
	}
}
public class Derived {
public static void main(String[] args) {
//	Grandparents p1= new parents();implicit upcasting
//	p1.myhome();
//	parents ph=(parents) p1;downcasting always explicit
//	ph.myhome();
	child c1=new child();//explicit upcasting
	parents p= (parents) c1;
	c1.myhome();
	
			
}
}
