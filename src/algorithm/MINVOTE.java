package algorithm;

import java.util.Scanner;

public class MINVOTE {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int arr[]=new int[n];
			long res[]=new long[n];
			for(int j=0;j<n;j++) {
				arr[j]=s.nextInt();
			}
			
			for(int j=0;j<n;j++) {
				int index=j;
				long tempsum=0;
				while(--index>=0) {
					if(tempsum<=arr[index]) res[j]++;
					tempsum=tempsum+(long)arr[index];
				}
				tempsum=0;
				index=j;
				while(++index<arr.length) {
					if(tempsum<=arr[index]) res[j]++;
					tempsum=tempsum+arr[index];
				}
			}
			
			for(int j=0;j<n;j++) {
				System.out.print(res[j]+" ");
			}
		}

	}

}
