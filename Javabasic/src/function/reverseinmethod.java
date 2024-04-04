package function;

public class reverseinmethod {

	public static void main(String[] args) {
		reverseinmethod ref=new reverseinmethod();
		int num=ref.reverseNum(123);
		System.out.println(num);
//		System.out.println(ref.reverseNum(123));

	}
public int reverseNum(int num) {
	int rev=0,rem;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	return rev;
}
}
