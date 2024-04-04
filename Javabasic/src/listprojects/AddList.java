package listprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;

public class AddList {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		Queue<Integer> queue=new PriorityQueue<Integer>();
		queue.addAll(li);
		System.out.println("Queue: "+queue);
	}
}
