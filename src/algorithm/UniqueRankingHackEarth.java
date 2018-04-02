package algorithm;

import java.util.Scanner;

public class UniqueRankingHackEarth {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int k=s.nextInt();
	        int[][] arr=new int[n][k];

	        int[] stc=new int[n];
	       
	       
	        for(int i=0;i<n;i++){
	        for(int j=0;j<k;j++) arr[i][j]=s.nextInt();
	        }
	        int q=s.nextInt();
	             
	           for(int i=0;i<q;i++){
	            for(int ii=0;ii<n;ii++){
	         	    stc[ii]=ii+1;
	         	       }
	             int nos=s.nextInt();
	             int[] qa=new int[nos];
	             for(int j=0;j<nos;j++) qa[j]=s.nextInt();
	             int res=0;
	             for(int l=0;l<nos;l++){
	              int tempmin=101;
	              int count=0;
	              for(int m=0;m<n;m++){
	            	  if(stc[m]==0) continue;
	              if(tempmin>arr[m][qa[l]-1]) {
	            	tempmin =   arr[m][qa[l]-1];
	            	res=m+1;
	              }

	              }
	              for(int m=0;m<n;m++) {
	            	  if(tempmin==arr[m][qa[l]-1]) {
	            		  count++;
	            	  }else {
	            		  stc[m]=0;
	            	  }
	              }
	              if(count==1) {
	            	  break;
	              }

	             }
                System.out.println(res);
	             }


	}

}
