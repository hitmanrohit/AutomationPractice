package ifelse;

public class ifexample1 {

	public static void main(String[] args) {
		char ch = 'A';
		if (ch == 'A') {
			System.out.println("Given character " + ch + " is a vowel.");
		} else if (ch == 'E') {
			System.out.println("Given character " + ch + "is a vowel.");
		} else if (ch == 'I') {
			System.out.println("Given character " + ch + "is a vowel.");
		} else if (ch == 'O') {
			System.out.println("Given character " + ch + "is a vowel.");
		} else if (ch == 'U') {
			System.out.println("Given character " + ch + "is a vowel.");
		} else {
			System.out.println("Given character " + ch + " is not a vowel.");
		}
		System.out.println("-----------another method-------------");
		char cr = 'A';
		if (cr == 'A' || cr == 'E' || cr == 'I' || cr == 'O' || cr == 'U') {
			System.out.println("Given is vowel.");
		} else {
			System.out.println("Given character is a consonant.");
		}
	}

}
