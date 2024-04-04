package stringprojects;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str= " Big Brain ";
		String[] newstr = str.split(" ");
		String reverseString = "";
		for(int i=0;i<newstr.length;i++) {
			String word= newstr[i];
			String reverseWord= "";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord= reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord +" ";
		}
		System.out.println(reverseString);
	}
}
