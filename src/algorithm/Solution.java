package algorithm;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution obj =new Solution();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int nums1[]=new int[n];
		int nums2[]=new int[m];
		for(int i=0;i<n;i++) {
		nums1[i]=s.nextInt();	
		}
		for(int i=0;i<m;i++) {
			nums2[i]=s.nextInt();	
			}
		double res=obj.findMedianSortedArrays(nums1,nums2);
		System.out.println(res);

	}
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int med=(nums1.length+nums2.length)/2;
	        int index=0;
	        int ind1=0;
	        int ind2=0;
	        int medSum=0;
	        while(index<=med) {
	        if(ind1<nums1.length && ind2<nums2.length && nums1[ind1]<=nums2[ind2]){
	        	if((nums1.length+nums2.length)%2==0 && index==med-1) {
	        		medSum=medSum+nums1[ind1];
	        	}else if(index==med) {
	        		medSum=medSum+nums1[ind1];
	        	}
	        	ind1++;
	        }else if(ind1<nums1.length && ind2<nums2.length && nums1[ind1]>nums2[ind2]){
	        	if((nums2.length+nums1.length)%2==0 && index==med-1) {
	        		medSum=medSum+nums2[ind2];
	        	}else if(index==med) {
	        		medSum=medSum+nums2[ind2];
	        	}
	        	ind2++;
	        }else if(ind1<nums1.length) {
	        	if((nums1.length+nums2.length)%2==0 && index==med-1) {
	        		medSum=medSum+nums1[ind1];
	        	}else if(index==med) {
	        		medSum=medSum+nums1[ind1];
	        	}
	        	ind1++;
	        }else {
	        	if((nums2.length+nums1.length)%2==0 && index==med-1) {
	        		medSum=medSum+nums2[ind2];
	        	}else if(index==med) {
	        		medSum=medSum+nums2[ind2];
	        	}
	        	ind2++;
	        }
	        index++;
	       
	        }
	        return ((nums2.length+nums1.length)%2==0)?(double)medSum/2:(double)medSum;
	        
	    }
	 
	

}
