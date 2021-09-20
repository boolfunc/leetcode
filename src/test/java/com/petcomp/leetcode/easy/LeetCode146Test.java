package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode146Test {


    @Test
    public void testLru(){

        LRUCache<Integer, Integer> lruCache = new LRUCache<>(2);
        lruCache.put(1, 11);
        lruCache.put(2, 22);
//        lruCache.put(3, 33);
//        lruCache.put(4, 44);
//
//        lruCache.put(5, 55);
//
//        lruCache.put(6, 66);

        System.out.println(lruCache.get(1));
        lruCache.put(3, 33);

        System.out.println(lruCache.get(2));

        System.out.println(lruCache.get(1));
        lruCache.put(4, 44);

        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));







    }
}
