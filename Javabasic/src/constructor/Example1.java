package constructor;

public class Example1 {
//default constructor
	int age;
	public static void main(String[] args) {
		System.out.println("Program Starts.");
//		to load non-static members into the memory
		Example1 ref=new Example1();
		System.out.println("age: "+ref.age);
		System.out.println("Program Ends");

	}

}
//Constructor is use to initialize non-static members of the class
//It is similar to a method but it won't have return type and its name
//should be same as classname.
// Constructor get called automatically when class instance/object is created

