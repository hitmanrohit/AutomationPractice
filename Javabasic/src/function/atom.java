package function;

public class atom {
public static void main(String[] args) {
	
	boolean res=checkPrime(8);
	System.out.println(res);
	atom ref=new atom();
	ref.printAtoM('A','F');
	//printAtoM('a','f');
}
static boolean checkPrime(int num1) {
	boolean result=false;
	int ct=0;
	for(int i=1;i<=num1;i++) {
		if(num1%i==0) {
			ct++;
		}
	}
	if(ct==2) {
		result=true;
	}
	else {
		result=false;
	}
	return result;
	
}
public void printAtoM(char ch,char ch2) {
	for(;ch<=ch2;ch++) {
		System.out.println(ch);
	}
}
}
