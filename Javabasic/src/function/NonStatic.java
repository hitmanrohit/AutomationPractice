package function;

public class NonStatic {

	public static void main(String[] args) {
		NonStatic ref=new NonStatic();
		System.out.println(ref.simpleIntrest(1000,20,2));

	}
public int simpleIntrest(int p,int r,int t) {
	int si= (p*r*t)/100;
	return si;
}
}
