package com.petcomp.leetcode.easy;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();//Store the data
        s2 = new Stack<>();//Temp stack
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s1.isEmpty()){
            Integer item = s1.pop();
            s2.push(item);
        }

        Integer toPop = s2.pop();
        while(!s2.isEmpty()){
            Integer item = s2.pop();
            s1.push(item);
        }

        return toPop;
    }

    /** Get the front element. */
    public int peek() {

        while(!s1.isEmpty()){
            Integer item = s1.pop();
            s2.push(item);
        }

        Integer toPeek = s2.peek();
        while(!s2.isEmpty()){
            Integer item = s2.pop();
            s1.push(item);
        }

        return toPeek;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */