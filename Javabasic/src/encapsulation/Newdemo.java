package encapsulation;

public class Newdemo {
	public static void main(String[] args) {
		hello h1 = new hello();
		System.out.println(h1.getAge());
		System.out.println(h1.getSalary());
		h1.setAge(12);
		System.out.println("updated age: "+h1.getAge());
		hello h2= new hello();
		System.out.println(h2.getAge());
	}
}
class hello{
	private int age=23;
	private double salary=34.99;
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public void setAge(int age) {
		this.age= age;
	}
	
}