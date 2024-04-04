package global;

public class globalprac {
	int a;
	static int b;
	globalprac(){
		int a= 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	globalprac(int a){
		this();
		System.out.println("hello");
	}
public static void main(String[] args) {
	globalprac g1=new globalprac(10);
	System.out.println("nsgv "+g1.a);
}
}
