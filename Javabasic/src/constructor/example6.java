package constructor;

public class example6 {
	static int age=25;

	public static void main(String[] args) {
		System.out.println("SGV age: "+age);
		int age=10;
		System.out.println("local age: "+age);
		System.out.println("SGV age: "+example6.age);

	}

}
