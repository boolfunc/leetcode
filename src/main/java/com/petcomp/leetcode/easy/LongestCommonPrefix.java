package com.petcomp.leetcode.easy;


public class LongestCommonPrefix {
    
    public String getLongestCommonPrefix(String[] strs){

        if(strs.length <= 0){
            return "";
        }

        char[] common = new char[200];

        for(int i =0; i < strs[0].length(); i++){
            char current = strs[0].toCharArray()[i];
            for(int j = 1; j < strs.length; j++){

                if(strs[j].length() < i + 1){
                    return new String(common).trim();
                }

                if(strs[j].toCharArray()[i] == current){
                    continue;
                }else{
                    return new String(common).trim();
                }
            }

            common[i] = current;
        }

        return new String(common).trim();
    }
}
