package com.petcomp.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        System.out.println(Arrays.toString(Arrays.copyOf(innerMerge(nums1, m, nums2, n), m)));
        nums1 = innerMerge(nums1, m, nums2, n).clone();
    }

    private int min(int m, int n){
        return m < n ? m : n;
    }

    /**
     * 合并有序数组
     * 将两个有序数组合并后返回，返回结果仍为有序数组
     * @param a
     * @param b
     * @return
     */
    public int[] innerMerge(int[] a, int m, int[] b, int n){

        int[] c = new int[a.length];

        int ia = 0, ib = 0;
        for(int i = 0; i < c.length; i++){
            if(n <= ib || a[ia] < b[ib] && ia < m){
                c[i] = a[ia++];
            }else if(ib < n){
                c[i] = b[ib++];
            }

            System.out.println("a=" + ia + ",b=" + ib + ":" + Arrays.toString(c));
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = { 1,2,3,0,0,0};
        int[] b = { 2,5,6};

        MergeSortedArray88 sort = new MergeSortedArray88();
        sort.merge(a, 3, b, 3);
//        int[] c = sort.innerMerge(a, 19, b, 10);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(c));
    }
}
