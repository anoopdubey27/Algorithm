package algorithm;

import java.util.Scanner;

public class NinjacartElevator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int p=s.nextInt();
			int w=s.nextInt();
			int[] nop=new int[n-1];
			int totp=0;
			for(int j=0;j<n-1;j++) {
				nop[j]=s.nextInt();
				totp=totp+nop[j];
			}
			int arr[]=new int[2*totp];
			for(int j=0;j<2*totp;j++) {
				arr[j]=s.nextInt();
			}
			int res=n;
			int pers=0;
			int wght=0;
			for(int j=0;j<n-1;j++) {
			pers = 0;
			wght = 0;
			int tt=0;
			for(int l=0;l<=j;l++) {
			for(int k=2*tt;k<nop[l];k++) {
				
				if(arr[k]>j+1) {
				pers=pers+arr[k];
				wght=wght+arr[k+nop[l]];
				}
			}
			tt=nop[l]+tt;
			}
			System.out.println(w+"----------------------"+wght);
			if(pers > p || wght>w) {
				
				res=j+1;
				break;
			}
			
		}
           System.out.println(res);
	}

}
}
