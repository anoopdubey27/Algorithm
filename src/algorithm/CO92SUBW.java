package algorithm;

import java.util.Scanner;

public class CO92SUBW {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int sum=0;
			int res=0;
			int ii=1;
			int preSum=0;
			while(sum<n) {
				preSum=sum;
				sum=sum+ii;
				ii++;
				res++;
			}
			if(n-preSum+res-1<res+sum-n) res=res-1+(n-preSum);
			else {
				res=res+(sum-n);
			}
			System.out.println(res);
		}

	}

}
