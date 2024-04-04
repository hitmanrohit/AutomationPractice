package string;

public class Buffer {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer("Gamelover");
	System.out.println(sb);
	sb.append("goku");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	sb.insert(1,"team");
	System.out.println(sb);
}
}
