package constructor;

public class example2 {
	example2(){
		System.out.println("I am zero param cons");
		age=25;
	}
    int age;
	public static void main(String[] args) {
		//to load non-static members into the memory
		example2 ref=new example2();
		System.out.println("age using ref: "+ref.age);
		example2 ref2=new example2();
		System.out.println("age using ref2: "+ref2.age);

	}

}
