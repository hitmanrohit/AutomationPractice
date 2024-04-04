package switchh;

public class simplemaths {
public static void main(String[] args) {
	char ops='%';
	int num1=5,num2=2,result;
	switch(ops) {
	case('+'):
		result=num1+num2;
	System.out.println("Addition of given numbers= "+result);
	break;
	case('*'):
		result=num1*num2;
	System.out.println("Multiplication of given numbers= "+result);
	break;
	case('-'):
		result=num1-num2;
	System.out.println("Substraction of given numbers= "+result);
	break;
	case('%'):
		result=num1%num2;
	System.out.println("Modulus of given numbers= "+result);
	break;
	default:
		System.out.println("Invalid operation.");
	}
}
}
