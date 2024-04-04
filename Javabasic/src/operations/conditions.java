package operations;

public class conditions {
public static void main(String[] args) {
	int num1=20,num2=25;
	boolean res1=(num1>num2);
	boolean res2=(num1<=num2);
	System.out.println("result1 -" + res1);
	System.out.println("result2 -" + res2);
	boolean res3=(res1||res2);
	System.out.println("result3 -" + res3);
	boolean res4=(res1&&res2);
	System.out.println("result4 -" + res4);
}
}
