package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LetterConstruct383 {

    public boolean canConstuct(String ransomNote, String magazine){
        char[] ransom = ransomNote.toCharArray();
        char[] mags = magazine.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : mags){
            Integer count = map.get(ch);
            if (count == null){
                map.put(ch, 1);
            }else{
                map.put(ch, 1+count);
            }
        }

        for(char ch : ransom){
            Integer count = map.get(ch);
            if (count == null){
                return false;
            } else {
                if (count < 1){
                    return false;
                }
                map.put(ch, count-1);
            }
        }
        return true;
    }
}
