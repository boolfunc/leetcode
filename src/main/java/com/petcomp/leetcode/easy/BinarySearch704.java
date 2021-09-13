package com.petcomp.leetcode.easy;

public class BinarySearch704 {

    public int search(int[] nums, int target){

        return search(nums, 0, nums.length - 1, target);
    }

    public int search(int[] nums, int start, int end, int target){
        if (start > end || (start == end && nums[start] != target)){
            return -1;
        }
        if (target == nums[(start+end)/2]){
          return (start+end)/2;
        } else if (target < nums[(start+end)/2]){
            return search(nums, start, (start+end)/2, target);
        }else{
            return search(nums, (start+end)/2+1, end, target);
        }
    }
}
