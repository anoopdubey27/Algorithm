package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class XXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=s.nextInt();
		int arr[]=new int[n];
		int narr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			narr[i]=arr[i] ^ ((Integer.highestOneBit(arr[i]) << 1) - 1);
		}
		for(int j=0;j<t;j++) {
		long s1=0;
		long s2=0;
		int l=s.nextInt();
		int r=s.nextInt();
		for(int k=l-1;k<r;k++) {
			s1=s1+(long)arr[k];
			s2=s2+(long)narr[k];
			System.out.println("------------"+narr);
		}
		long res=s2>s1?(2147483647-(s2-s1)):(2147483647-(s1-s2));
		System.out.println(res);
		}
		}
		
		
		

}
