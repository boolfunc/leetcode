package com.petcomp.leetcode.easy;

public class MergeTwoLists {

    /**
     * 合并两个升序列表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode merge(ListNode l1, ListNode l2){


        ListNode root = null, current = null, parent = null;
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        int rootGet = 0;
        while (l2 != null || l1 != null){

            if (l1 == null || l2 != null && l1.val > l2.val){
                current = l2;
                l2 = l2.next;
            }else{
                current = l1;
                l1 = l1.next;
            }
            if (rootGet == 0){
                root = current;
                parent = root;
            }else{
                parent.next = current;
                parent = parent.next;
            }



            rootGet++;
        }


        return root;
    }
}
