package com.petcomp.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LeetCode21Test {

    @Test
    public void testMergeTwoLists(){

        MergeTwoLists mergeTwoLists = new MergeTwoLists();

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);

//        l1.next = new ListNode(3);
//        l1.next.next= new ListNode(5);

//        l2.next = new ListNode(4);
//        l2.next.next = new ListNode(6);


        ListNode merge = mergeTwoLists.merge(l1, l2);

        while(merge != null){
            System.out.println(merge.val);
            merge = merge.next;
        }

    }
}
