package Inheritation;
class RBI{
	void reserve(){
		System.out.println("Bap of all banks in Bharat.");
	}
}
class SBI extends RBI{
	void stateBank() {
		System.out.println("Lunch time ke bad ana.");
	}
}

public class childexample2 {

	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.reserve();
		s1.stateBank();
		
	}

}
