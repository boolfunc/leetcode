package com.petcomp.leetcode.easy;

public class SearchInsert35 {

    public int searchInsert(int[] nums, int target){

        int index = 0;
        int i = 0;
        for(i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                index = i;
                return index;
            }else{
                continue;
            }
        }

        index = i;

        return index;
    }
}
