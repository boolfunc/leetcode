package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class AnagramWord242 {

    public boolean isAnagram(String s, String t) {

        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : cht){
            Integer count = map.get(ch);
            if (count == null){
                map.put(ch, 1);
            }else{
                map.put(ch, 1+count);
            }
        }

        for(char ch : chs){
            Integer count = map.get(ch);
            if (count == null) {
                return false;
            } else {
                map.put(ch, count-1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
