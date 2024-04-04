package global;

public class example3 {
	int num1,num2;
	static int result;
public static void main(String[] args) {
	System.out.println("Program starts.");
	example3 ref =new example3();
	ref.num1=23;
	ref.num2=34;
	System.out.println("nsgv num1= "+ref.num1);
	System.out.println("nsgv num2= "+ref.num2);
	result= ref.num1;
	ref.num1=ref.num2;
	ref.num2=result;
	System.out.println("after swap nsgv num1= "+ref.num1);
	System.out.println("after swap nsgv num2= "+ref.num2);
}
}
