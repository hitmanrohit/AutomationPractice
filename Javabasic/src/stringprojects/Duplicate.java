package stringprojects;

public class Duplicate {
	public static void main(String[] args) {
		String str1= "better butter";
		int count;
		char[] string= str1.toCharArray();
		System.out.println("Duplicate characters in given string");
		for(int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1;j<string.length;j++) {//why
				if(string[i]==string[j]&& string[i]!='0') {
					count++;
					string[j]=0;
				}
			}
			if(count>1 && string[i]!=0) {
				System.out.println(string[i]+"-"+count);
			}
		}
	}
}
