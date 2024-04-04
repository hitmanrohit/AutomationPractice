package function;

public class evencheck {
	public static void main(String[] args) {
		int n1 = 7;
		System.out.println("Is number even? " + checkEven(n1));
		boolean res= checkEven(n1);
		System.out.println(res);
	}

	static boolean checkEven(int num1) {
		boolean result = false;
		if (num1 % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
