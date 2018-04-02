package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringEqualPair {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	       int t=s.nextInt();
	       for(int i=0;i<t;i++){
	           int n=s.nextInt();
	           HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	           int no[]=new int[n*2];
	           for(int j=0;j<2*n;j++){
	               no[j]=s.nextInt();
	           }
	           for(int j=0;j<2*n;j+=2){
	               int temp=no[j];
	               while(temp<no[j+1]){
	                   int k=temp;
	                   hm.put(temp, hm.get(temp)+1);
	               }
	           }
	           int countres=0;
	           int res=0;
	           for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
	        	    int  key = entry.getKey();
	        	    int value = entry.getValue();
	        	    if(value>countres) {
	        	    	res=key;
	        	    	countres=value;
	        	    }
	        	}
	           System.out.println(res);
	       }
	}

}
