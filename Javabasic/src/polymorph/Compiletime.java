package polymorph;

public class Compiletime {
static void sum(int a,int b) {
	int c= a+b;
	System.out.println("the sum of two nums: "+c);
}
static void sum(int a, int b, int e) {
	int c= a+b+e;
	System.out.println("the sum of three nums: "+c);
}
public static void main(String[] args) {
	Compiletime c= new Compiletime();
	c.sum(10,20);
	c.sum(4, 45,45);
}
}
