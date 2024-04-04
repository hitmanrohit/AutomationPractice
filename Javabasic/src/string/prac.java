package string;

public class prac {
	public static void main(String[] args) {
		String a= "Username : Admin";
		String fa =a.replace("Username : ", "");
		System.out.println(fa);
		String rstr="";
		char ch;
		for(int i=0;i<a.length();i++) {
			ch=a.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println("Reverse String: "+rstr);
	}

}
