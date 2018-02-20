package algorithm;

import java.util.Scanner;

public class LuckyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			if(n>2) {
				int[] arr=new int[n];
				String str[]=new String[n];
				str[0]="5";
				str[1]="8";
				n=n-2;
				int j=0;
				int jj=1;
				int index=2;
				while(n-->0) {
		        String temp = (jj%2==0)?str[1]:str[0];
				str[index]= str[j] + temp; 
				if(jj%2==0){
					j++;
					jj=1;
				}else
				 jj++;
				 index++;
				}
				System.out.println(str[str.length-1]);
			}else {
				String res=(n==1)?"5":"8";
				System.out.println(res);
			}
		}

	}

}
