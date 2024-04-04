package projects;

public class count {
public static void main(String[] args) {
	int ct=0;
	for(int num=123;num!=0;num=num/10) {
		ct++;
	}
	System.out.println("No. of digit ="+ct);
}
}
