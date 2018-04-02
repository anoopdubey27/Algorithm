package algorithm;

import java.util.Scanner;

public class MotuandPatlu {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			long[] arr=new long[n];
			for(int j=0;j<n;j++) arr[j]=s.nextLong();
			int f=0;
			int l=n-1;
			long msum=0;
			long psum=0;
			int mcount=0;
			int pcount=0;
			String res="";
			while(f<=l) {
				if(f==0) {
				msum=msum+(long)arr[f];
				f++;
				mcount++;
				}
				else if(msum<=2*psum) {
					msum=msum+(long)arr[f];
					f++;
					
					mcount++;
				}else {
					psum=psum+(long)arr[l];
					l--;
					pcount++;
				}
			}
		 if(mcount>pcount) res=res+"Motu";
		 else if(mcount<pcount) res=res+"Patlu";
		 else res=res+"Tie";
		 System.out.println(mcount+" "+pcount);
		 System.out.println(res);
			
			
		}

	}

}
