package algorithm;

import java.util.Scanner;

public class NoddyandhisVowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			String str=s.next();
			int count=0;
			int[] arr=new int[26];
			for(int ii=0;ii<str.length();ii++) {
				char ch=str.charAt(ii);
				arr[(int)ch-97]++;
			}
			String res="";
			if(arr[0]!=0 && arr[4]!=0 && arr[8]!=0 && arr[14]!=0 && arr[20]!=0) res=res+"YES";
			else res=res+"NO";
			System.out.println(res);
				
		}

	}

}
