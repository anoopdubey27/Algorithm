package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PSHTRG {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int q=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<q;i++) {
			int que[]=new int[3];
			for(int j=0;j<3;j++) {
				que[j]=s.nextInt();
			}
			
			if(que[0]==1) {
				arr[que[1]-1]=que[2];
			}else {
				long maxper=0;
				if(arr.length>=3) {
			int[] tempArr=Arrays.copyOfRange(arr,  que[1]-1, que[2]);
			 Arrays.sort(tempArr);
					for(int k=tempArr.length-1;k>=2;k--) {
					long tempper=(((long)(tempArr[k]+tempArr[k-1])>(long)(tempArr[k-2])) && ((long)(tempArr[k-1]+tempArr[k-2])>(long)tempArr[k]) && ((long)(tempArr[k-2]+tempArr[k])>(long)tempArr[k-1])) ?(long)tempArr[k]+(long)tempArr[k-1]+(long)tempArr[k-2]:0;
					if(maxper < tempper){
		               maxper=tempper; 
		            } 
					if(maxper>0)
		                break;
		            }
		}
				System.out.println(maxper);
				
 
	}
 
}
		
	}}