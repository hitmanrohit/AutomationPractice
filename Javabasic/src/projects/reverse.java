package projects;

public class reverse {
public static void main(String[] args) {
	int rem,rev=0;
	for(int n1=123;n1!=0;n1=n1/10) {
		rem=n1%10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
}
}
