package constructor;

public class example4 {
	example4(){
		System.out.println("I am zero-param cons");
	}
	example4(int num){
		System.out.println("I am int-param cons");
		age=num;
	}
	int age;
	public static void main(String[] args) {
		example4 ref=new example4();
		System.out.println(ref.age);
		example4 ref2 = new example4(30);
		System.out.println(ref2.age);
	}

}
