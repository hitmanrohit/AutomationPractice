package global;

public class example2 {
	int num1,num2;
	static int result;
public static void main(String[] args) {
	example2 ref= new example2();
	ref.num1=12;
	ref.num2=35;
	result = ref.num1+ ref.num2;
	System.out.println("Addition of two numbers ="+ result); 
	
	example2 ref2= new example2();
	ref2.num1 =25;
	ref2.num2 =10;
	result=ref2.num1%ref2.num2;
	System.out.println("NSGV result2 = "+ result);
	
}
}
