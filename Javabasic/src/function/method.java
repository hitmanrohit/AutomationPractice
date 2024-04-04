package function;

public class method {
public static void main(String[] args) {
	addTwoNumber();
	additionOfTwoNumbers(12,23);
}
static void additionOfTwoNumbers(int num1,int num2) {
	int result=num1+num2;
	System.out.println("Result= "+result);
}
static void addTwoNumber() {
	int num1=10,num2=20,result;
	result=num1+num2;
	System.out.println("result= "+result);
}
}
