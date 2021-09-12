package com.petcomp.leetcode.easy;

public class StrStr28 {

    /**
     * 在字符串haystack中找到needle，并返回索引，如果不存在则返回-1
     * @param haystack
     * @param needle
     * @return
     */
    public int index(String haystack, String needle){

        int index = 0;
        if (haystack == null || needle == null){
            return -1;
        }

        char[] hayStr = haystack.toCharArray();
        char[] needleStr = needle.toCharArray();
        if (needle.equals("")){
            return 0;
        }
        if (hayStr.length < needleStr.length){
            return -1;
        }
        int i = 0, j = 0;
        for(; j <= hayStr.length - needleStr.length; j++){
            for(i = 0; i < needleStr.length; i++){
                if(hayStr[i+j] == needleStr[i]){
                    if (i == needleStr.length - 1){
                        return j;
                    }
                    continue;
                }else{
                    break;
                }
            }
        }

        if (i == needleStr.length){
            index = j;
        }else{
            index = -1;
        }
        return index;
    }
}
