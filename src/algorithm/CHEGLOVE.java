package algorithm;

import java.util.Scanner;

public class CHEGLOVE {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int f[]=new int[n];
			int g[]=new int[n];
			for(int j=0;j<n;j++) {
				f[j]=s.nextInt();
			}
			for(int j=0;j<n;j++) {
				g[j]=s.nextInt();
			}
			boolean front=false;
			boolean back=false;
			for(int j=0;j<n;j++) {
				if(f[j]<=g[j]) {
			 front = (j==n-1)?true:front;
				}else {
					break;
				}
			}
			for(int j=0;j<n;j++) {
				if(f[j]<=g[n-j-1]) {
			 back = (j==n-1)?true:back;
				}else {
					break;
				}
			}
			String res="";
			if(front && back) res=res+"both";
			else if(front) res=res+"front";
			else if(back) res=res+"back";
			else res=res+"none";
			System.out.println(res);
			
			
		}

	}

}
