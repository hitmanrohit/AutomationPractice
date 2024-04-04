package stringprojects;

public class Reversestring {
	public static void main(String[] args) {
		//prog-1 reverse string
		String str= "Reverse String";
		System.out.println("The given string is: "+str);
		String str2= "";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			str2= ch+str2;
		}
		System.out.println("Reverse string: "+str2);
		//prog-2 remove whitespaces
		String str3=" Hello boys ";
		str3= str3.replaceAll("\\s", "");//  \\s is a single space in unicode
		System.out.println(str3);
		
	}
	
}
