package Inheritation;
class RBI1{
	RBI1(int num){
		System.out.println("Rbiconst");
	}
	void reserve(){
		System.out.println("Bap of all banks in Bharat.");
	}
}
class SBI1 extends RBI1 {
	SBI1(){
		super(2);
		System.out.println("Sbiconst");
	}
	void stateBank() {
		System.out.println("Lunch time ke bad ana.");
	}
}

public class childexample3 extends SBI1{
	void child() {
		System.out.println("Hello child");
	}
	public static void main(String[] args) {
		childexample3 c1=new childexample3();
		c1.child();
		c1.stateBank();
		c1.reserve();
		System.out.println("*******************");
		SBI1 s1=new SBI1();
		s1.stateBank();
		s1.reserve();
		
	}
}
