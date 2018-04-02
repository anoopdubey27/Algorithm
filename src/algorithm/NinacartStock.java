package algorithm;

import java.util.Scanner;

public class NinacartStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int maxsum=0;
		int currsum=0;
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		for(int i=0;i<n;i++){
			currsum=currsum+arr[i];
			if(currsum>maxsum) maxsum=currsum;
			if(currsum<0) {
				currsum=0;
			}
		}
		System.out.println(maxsum);

	}

}
