package wrapper;
final class Testing{
	final String name ;
	final int salary;
	Testing(String s1,int num1){
		name =s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
public class Immutableclass {
	public static void main(String[] args) {
		Testing t1= new Testing("jelly",29);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
	}

}
