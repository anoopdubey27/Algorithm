package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MINEAT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int h=s.nextInt();
			int[] arr=new int[n];
			long sum=0;
			for(int j=0;j<n;j++) {
				arr[j]=s.nextInt();
				sum=sum+arr[j]/h;
			}
			long tres=sum;
			long res=0;
			Arrays.sort(arr);
	       while(true) {
				long tempres=0;
					for(int l=0;l<arr.length;l++) {
						tempres=tempres+(((long)arr[l]%(long)tres==0)?(long)arr[l]/(long)tres:((long)arr[l]/(long)tres)+1);
						if(tempres>h) break;
					}
				if(tempres<=h && tempres!=0) {
					res=tres;
					break;
				}
				tres++;
			}
			System.out.println(res);
			
		}

	}

}
