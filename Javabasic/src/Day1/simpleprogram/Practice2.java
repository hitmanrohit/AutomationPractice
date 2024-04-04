package Day1.simpleprogram;
class swap{
	public void swapNums(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"/"+b);
	}
}

public class Practice2 extends hello{
	float a=1.2f;
	float b=2.3f;
	float product=a*b;
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		double sum = a + b;
		System.out.println("Sum of two numbers: "+sum);
		Practice2 p1=new Practice2();
		System.out.println("product of two no.: "+p1.product);
		int f='B';
		System.out.println("Ascii value: "+f);
		hello h1=new hello();
		System.out.println("Quotient: "+h1.quotient);
		System.out.println("Remainder: "+h1.remainder);
		swap s1=new swap();
		s1.swapNums(10, 20);
	}
}
class hello{
	double a=19.0;
	double b=2.0;
	double quotient=a/b;
	double remainder = a%b;
}

