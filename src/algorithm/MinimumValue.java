package algorithm;

import java.util.Scanner;

public class MinimumValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int mod=10000007;
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int k=s.nextInt();
			int[] arr=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=s.nextInt();
			}
			int res=10000007;
			for(int ii=0;ii<n-1;ii++) {
				for(int j=ii+1;j<n;j++) {
					int sp=((int)Math.pow(Math.abs(arr[i]-arr[j]), k))%mod;
					int sn=((int)Math.pow(Math.abs(arr[i]+arr[j]), k))%mod;
					int tot=(sp*sn)%mod;
					if(res>tot) res=tot;
				}
			}
			System.out.println(res);
			
			
		}

	}

}
