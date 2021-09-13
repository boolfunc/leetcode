package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LinkedListHasCircle141 {

    public boolean hasCircle(ListNode head){

        Map<ListNode, Integer> marked = new HashMap<>();

        boolean hasCircle = false;
        int pos = 0;
        while (head != null){
            if (marked.get(head) == null){
                marked.put(head, pos);
            }else{
                System.out.println(marked.get(head));
                hasCircle = true;
                return hasCircle;
            }
            head = head.next;
            pos++;
        }

        return hasCircle;
    }
}
