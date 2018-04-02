package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CO92JUDG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int[] a=new int[n];
			int[] b=new int[n];
			for(int j=0;j<n;j++) {
				a[j]=s.nextInt();
			}
			for(int j=0;j<n;j++) {
				b[j]=s.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int s1=0;
			int s2=0;
			for(int j=0;j<n-1;j++) {
				s1=a[j]+s1;
			}
			for(int j=0;j<n-1;j++) {
				s2=b[j]+s2;
			}
			String res="";
			if(s1<s2) res=res+"Alice";
			else if(s1>s2) res=res+"Bob";
			else res=res+"Draw";
			System.out.println(res);
		}
		

	}

}
