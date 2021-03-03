package com.petcomp.leetcode.easy;

public class SumOfTwo {
    
    public int[] sumOfTwo(int[] nums, int target){

        int result[] = {-1, -1};
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
