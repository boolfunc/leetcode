package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

public class LeetCode232Test {

    @Test
    public void testMyqueue(){
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        while(!queue.empty()){
            Integer top = queue.peek();
            System.out.println(top);
            Integer pop = queue.pop();
            System.out.println(pop);
        }
    }
}
