package projects;

public class palin {
public static void main(String[] args) {
	int n1=101,n2=0,rem,rev=0;
	n2=n1;
	for(n1=101;n1!=0;n1=n1/10) {
		rem=n1%10;
		rev=rev*10+rem;
	}
	if(rev==n2) {
		System.out.println("palindorm");
	}
	else {
		System.out.println("not palindom");
	}
}
}
