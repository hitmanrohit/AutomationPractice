package Day1.simpleprogram;



public class practice {
	public static void main(String[] args) {
		System.out.println(addTwoNumbers(67,34));
		System.out.println(checkVowel('K'));
		System.out.println(checkLarge(10,2,3));
		fivetimes();
		System.out.println(sumOfn(5));
	}
static int addTwoNumbers(int a,int b) {
	int result;
	result=a+b;
	return result;
}
static boolean checkVowel(char a) {
	boolean result=false;
	if (a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
		result=true;
	}
	else {
		result=false;
	}
	return result;
	
}
static int checkLarge(int a,int b,int c) {
	int result;
	if(a>b&&a>c) {
		result=a;
	}
	else if(b>a&&b>c) {
		result=b;
	}
	else {
		result=c;
	}
	return result;
}
static void fivetimes() {
	for(int i=1;i<=5;i++) {
		System.out.println("hello");
	}
}
static int sumOfn(int num) {
	int sum=0;
	for(int i=1;i<=num;i++) {
		sum=sum+i;
	}
	return sum;
}
	
}

