package com.petcomp.leetcode.easy;

public class RemoveDumplicates {

    public int removeDumplicates(int[] nums){

        int count = 0;
        for(int i = 1; i < nums.length - count; ){

            if (nums[i] == nums[i-1]){

                for(int j = i; j < nums.length - count; j++){
                    nums[j-1] = nums[j];
                }
                count++;
            }else{
                i++;
            }
        }

        return nums.length - count;
    }
}
