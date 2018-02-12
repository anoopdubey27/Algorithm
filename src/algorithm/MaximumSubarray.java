package algorithm;

import java.util.Scanner;

public class MaximumSubarray {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		int maxSum= maxSubArray(arr);
		System.out.println(maxSum);
	}

	 public static int maxSubArray(int[] nums) {
		 if(nums.length==0) return 0;
		 else {
			 int currSum=nums[0];
			 int prevSum=nums[0];
		 for(int i=1;i<nums.length;i++) {
			 if(currSum>prevSum && i>1 && nums[i-1]==0 || currSum>prevSum && currSum!=0 ) prevSum=currSum;
			 if(currSum<0) currSum=0;
			 currSum=currSum+nums[i];
		 }
		 if(currSum>prevSum) prevSum=currSum;
	        return prevSum;
	    }
	 }
}
