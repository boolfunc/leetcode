package com.murmur.leetcode;

public class MaxSubArray53 {

    public int maxSubArray(int[] nums){

        if (nums.length < 0){
            return 0;
        }
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
//            if (max < i){
//                max=i;
//            }

            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum+=nums[j];
                if (max < sum){
                    max=sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args){

        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray53 solution = new MaxSubArray53();
        System.out.println(solution.maxSubArray(nums));
    }
}
