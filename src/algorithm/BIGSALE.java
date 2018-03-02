package algorithm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BIGSALE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int[] arr=new int[3*n];
			for(int j=0;j<3*n;j++) {
				arr[j]=s.nextInt();
			} 
			double res=0.000000;
			for(int j=0;j<3*n;j+=3) {
				double bp=(double)arr[j]*(1+(double)arr[j+2]/100);
				double fp=(double)bp*(1-(double)arr[j+2]/100);
				res=res+(arr[j]*arr[j+1]-fp*arr[j+1]);
			}
			DecimalFormat df = new DecimalFormat("0.000000");
	   	    System.out.println(df.format(res));
	   	    
		}
		

	}

}
