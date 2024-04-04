package day2.work;


public class demo2 {
	public static void main(String[] args) {
		int n1=101,rem,rev=0;
		int n2=n1;
		while(n1!=0) {
			rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;
		}
		System.out.println(rev);
		if(rev==n2) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
