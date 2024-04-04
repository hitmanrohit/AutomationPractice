package listprojects;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class GetUnique {
	public static void main(String[] args) {
		List<String> li= new ArrayList();
		li.add("apple");
		li.add("Orange");
		li.add("grapes");
		li.add("banana");
		li.add("apple");
		Set<String> uniquefruit=new HashSet(li);
		System.out.println("Unique elements: "+ uniquefruit);
	}
}
