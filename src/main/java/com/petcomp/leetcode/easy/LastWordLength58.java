package com.petcomp.leetcode.easy;

public class LastWordLength58 {

    public int lengthOfLastWord(String sen){
        int length = 0;
        char[] chs = sen.toCharArray();
        int currentLength = 0;
        for(int i = 0; i < chs.length; i++){
            if (chs[i] == ' '){
                if (currentLength > 0){
                    length = currentLength;
                }
                currentLength = 0;
                continue;
            }else{
                currentLength++;
            }
        }
        if (currentLength > 0){
            length = currentLength;
        }

        return length;
    }
}
