package com.petcomp.leetcode.easy;

import java.util.Stack;

public class Palindrome234 {

    public boolean isPalindrome(ListNode head){


        Stack<Integer> palinStack = new Stack<Integer>();
        while (head != null){
            palinStack.push(head.val);
            head = head.next;
        }

        Stack<Integer> palinStack2 = reverse((Stack) palinStack.clone());

        return palinStack2.equals(palinStack);
    }



    private Stack<Integer> reverse(Stack<Integer> from){

        Stack<Integer> to = new Stack<>();

        while(!from.isEmpty()){
            to.push(from.pop());
        }

        return to;
    }

}
