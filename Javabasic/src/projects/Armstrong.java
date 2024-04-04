package projects;

public class Armstrong {
public static void main(String[] args) {
	int num=153,temp,last,sum=0;
	temp=num;
	while(temp>0) {
		last=temp%10;
		sum=sum+(last*last*last);
		temp=temp/10;
	}
	if(num==sum) {
		System.out.println("Given no.is armstrong.");
	}
	else {
		System.out.println("Given no.is not armstrong.");
	}
}
}
