package constructor;

public class example3 {
	example3(int num){
		System.out.println("I am int-param cons");
		age=num;
	}
	int age;
	public static void main(String[] args) {
		example3 ref= new example3(30);
		System.out.println(ref.age);
		example3 ref2=new example3(50);
		System.out.println(ref2.age);
	}

}
