package constructor;

public class Constprac {
	Constprac(int num){
		System.out.println("I am int param const");
	    a=num;
	}
	int a;
public static void main(String[] args) {
	Constprac c1= new Constprac(34);
	System.out.println(c1.a);
}
}
