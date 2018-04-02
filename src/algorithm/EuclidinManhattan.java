package algorithm;

import java.util.Scanner;

public class EuclidinManhattan {

	public static void main(String[] args) {
		EuclidinManhattan tt=new EuclidinManhattan();
		int[] nums = {2,11,15,7};
		int target=9;
		int[] res=tt.twoSum(nums, target);
		System.out.println(res[0]+"----------"+res[1]);
		}

	    public int[] twoSum(int[] nums, int target) {
	        int[] res=new int[2];
	        boolean rr=false;
	        for(int i=0;i<nums.length-1;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                    res[0]=i;
	                    res[1]=j;
	                    rr=true;
	                    break;
	                }
	            }
	            if(rr) break;
	        }
	        return res;
	    }

}
