package wrapper;

public class Boxing {
public static void main(String[] args) {
	int age=25;
	Integer obj= age;//implicit boxing
	Integer obj1=34;//implicit boxing
	Integer obj2 = (Integer) age;//explicit boxing
	Integer obj3= (Integer) 56;
	System.out.println("obj = "+obj);
	System.out.println("obj1 = "+obj1);
	System.out.println("obj2 = "+obj2);
	System.out.println("obj3 = "+obj3);
	int x=obj.intValue();//unboxing always explicit
	System.out.println(x);

}
}
