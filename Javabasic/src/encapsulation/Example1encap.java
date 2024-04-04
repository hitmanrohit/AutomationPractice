package encapsulation;

public class Example1encap {
	private int age=34;
	private int salary=56777;
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
}
class getset{
	public static void main(String[] args) {
		Example1encap e1=new Example1encap();
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
	}
	
}
