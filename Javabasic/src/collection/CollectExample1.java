package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectExample1 {
	public static void main(String[] args) {
//		ArrayList l1= new ArrayList();
		List list= new ArrayList(); //run time polymor
		System.out.println("is list empty: "+list.isEmpty());
		list.add("Hello"); //string object--> object class object (auto upcasting)
		list.add(123);//int--> Integer Object--> object class object
		list.add(true);//boolean object--> Boolean object--> object class object
		list.add(null);
		list.add("Hello");//duplicate
		System.out.println("List elements are: "+list);
		System.out.println("No. of elements in list: "+ list.size());
		list.add(1,"Selenium" );
		System.out.println("List elements are: "+list);
		System.out.println("No. of elements in list: "+ list.size());
		list.get(2);
		System.out.println("Element at index 2: "+list.get(2));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(Object obj:list) {
			System.out.println(obj);
		}
		
	}
}
