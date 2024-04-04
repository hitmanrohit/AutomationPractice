package listprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateCount {
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("audi");
		cars.add("bmw");
		cars.add("jaguar");
		cars.add("audi");
		cars.add("maruti");
		System.out.println("List elements: "+ cars);
		HashSet<String> hs=new HashSet<String>(cars);
		Iterator<String> it= cars.iterator();
		for(int i=0;i<=cars.size();i++) {
			String str=it.next();
			System.out.println(str+": ");
			System.out.println(Collections.frequency(cars,str));
		}
		
	}

}
