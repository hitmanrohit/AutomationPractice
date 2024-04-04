package global;

public class variables1 {
	static int num1,num2;
	int result;
public static void main(String[] args) {
	System.out.println("Program starts.");
	System.out.println("SGV num1= "+ num1);
	System.out.println("SGV num2= "+ num2);
	variables1 ref= new variables1();
	System.out.println("NSGV result = "+ ref.result);
    num1=20;
    num2=23;
    ref.result= num1+num2;
    System.out.println("Addition of two numbers = " + ref.result);
    variables1 ref2=new variables1();
    System.out.println("NSGV" +ref2.result);
}
}
