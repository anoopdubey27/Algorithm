package algorithm;

import java.util.Scanner;

public class PlayfulString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			String str1=s.next();
			String str2=s.next();
			
			int len1=str1.length();
			int len2=str2.length();
			int ii=0;
			int j=len1-1;
			int count=0;
			while(j>=0 && ii<str2.length()) {
				char ch1=str1.charAt(j);
				char ch2=str2.charAt(ii);
				if(ch1==ch2) {
					ii++;
					count++;
				}
				if(count==len2) break;
				j--;
			}
			String res="";
			if(count==str2.length()) res=res+"GOOD STRING";
			else res=res+"BAD STRING";
			System.out.println(res);
		}
	}

}
