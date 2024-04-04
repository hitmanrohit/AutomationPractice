package ifelse;

public class Ifprac {
public static void main(String[] args) {
	int a=6;
	if(a%2==0) {
		System.out.println("Given no. is even.");
	}
	else {
		System.out.println("Given no. is odd.");
	}
//==================================================================
	char ch ='E';
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		System.out.println("Given alphabet is vowel.");
	}
	else {
		System.out.println("Given alphabet is consonant.");
	}
}
}
