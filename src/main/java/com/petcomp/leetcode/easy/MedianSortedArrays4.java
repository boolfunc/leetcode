package com.petcomp.leetcode.easy;

public class MedianSortedArrays4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){

        int[] result = new int[nums1.length + nums2.length];

        int k = 0;
        int j = 0;
        int i = 0;
        if (nums1.length == 0){
            result = nums2;
        }else if(nums2.length == 0){
            result = nums1;
        }else{
            for(; i < nums1.length && j < nums2.length;){
                if (nums1[i] < nums2[j]){
                    result[k++] = nums1[i++];
                }else{
                    result[k++] = nums2[j++];
                }
            }

            for(;i < nums1.length;){
                result[k++] = nums1[i++];
            }
            for(; j < nums2.length;){
                result[k++] = nums2[j++];
            }

        }

        if (result.length % 2 == 1){
            return result[result.length/2];
        }else{
            return (result[result.length/2-1]*1.0 + result[result.length/2])/2;
        }
    }
}
