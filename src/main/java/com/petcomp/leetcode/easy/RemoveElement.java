package com.petcomp.leetcode.easy;

public class RemoveElement {

    public int removeElement(int[] nums, int num){

        int count = 0;
        for(int i = 0; i < nums.length - count; ){

            if (nums[i] == num){

                for(int j = i; j < nums.length - count - 1; j++){
                    nums[j] = nums[j+1];
                }
                count++;
            }else{
                i++;
            }
        }

        return nums.length - count;
    }
}
