package algorithm;

import java.util.Scanner;

public class CO92MATR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int m=s.nextInt();
			int[][] arr=new int[n][m];
			int[][] res=new int[n][m];
			for(int j=0;j<n;j++) {
				for(int k=0;k<m;k++) {
					arr[j][k]=s.nextInt();
				}
			}
			
			
		}

	}

}
