package algorithm;

import java.util.Scanner;

public class Swaps {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int cons=0;
		int index=0;
		int count=0;
		int tempcons=0;
		int tempind=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>=k) {
				if(tempcons==0) tempind=i;
				tempcons++;
				count++;
			}else {
				tempcons=0;
				tempind=0;
			}
			if(cons<tempcons) {
				index=tempind;
				cons=tempcons;
			}
		}
		
		System.out.println(count-cons);

	}

}
