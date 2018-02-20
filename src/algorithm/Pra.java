package algorithm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      for(int i=0;i<t;i++) {
  	      int ll=s.nextInt();
    	  int r=s.nextInt();
    	 int[] arr=new int[1000001];
    	 for(int j=2;j<11;j++) {
    		 arr[j]=j;
    	 }
    	 for(int j=2;j<=(int)Math.sqrt(1000001);j++){
    		 int no=j;
    		 int index=2;
		            while(true) {
		            	if(no*index>10) break;
		            	arr[no*index]=0;
		            	index++;
		        }
		    }
    	 int count=0;
    	 for(int l=ll;l<=r;l++) {
    		 if(l!=0 && l!=1 && arr[l]!=0)
    			 count++;
    	 }
    	 int tot=r-ll+1;
    	 double res=(double)count/tot;
    	 DecimalFormat df = new DecimalFormat("0.000000");
    	 System.out.println(df.format(res));
      }
	}

}
