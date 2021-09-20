package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {

    int capcity = 16;
    int size = 0;
    Map<K, CacheNode<K, V>> data = null;
    CacheNode<K, V> head;
    CacheNode<K, V> tail;

    public LRUCache(int capcity){
        data = new HashMap<>(capcity);
        this.capcity = capcity;
        head = null;
        tail = null;
    }

    public void put(K k, V v) {

        CacheNode<K, V> vExist = data.get(k);
        if (vExist == null){
            vExist = new CacheNode<>();
        }

        if (head == null){
            head = tail = vExist;
        } else {
          vExist.next = head;
          head.pre = vExist;
          head = vExist;
        }
        vExist.k = k;
        vExist.v = v;

        data.put(k, vExist);

        if (data.size() > capcity){
            //remove
            while(tail.next != null){
                tail = tail.next;
            }
            K toRemove = tail.k;
            tail.pre.next = null;
            tail = tail.pre;
            data.remove(toRemove);
        }

    }

    public V get(K k){

        CacheNode<K, V> vExist = data.get(k);

        if (vExist == null){
            return null;
        }
        resort(k);

        return vExist.v;
    }

    private void resort(K k) {
        CacheNode<K, V> current = head;
        while(current != null){
            if (current.k.equals(k)){
                if (current.pre!=null){
                    current.pre.next = current.next;
                }
                if (current.next != null){
                    current.next.pre = current.pre;
                }

                current.next = head;
                head.pre = current;
                break;

            }
            current = current.next;
        }
    }

    public int size(){
        return data.size();
    }

    class CacheNode<K, V> {
        K k;
        V v;
        CacheNode next;
        CacheNode pre;
    }
}
