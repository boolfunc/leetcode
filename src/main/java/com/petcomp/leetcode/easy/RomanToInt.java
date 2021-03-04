package com.petcomp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    static Map<Character, Integer> values = new HashMap<>(){
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };
    
    public int romanToInt(String s){

        char[] splited = s.toCharArray();

        int total = 0;

        for(int i = 0; i<splited.length; i++){
            if(!maybePrefix(splited[i]) || i == splited.length - 1){
                total += values.get(splited[i]);
            }else{
                char next = splited[i+1];
                switch(splited[i]){
                    case 'I':
                        if(next == 'V' || next == 'X'){
                            total += values.get(next) - values.get(splited[i]);
                            i++;
                            break;
                        }
                    case 'X':
                        if(next == 'L' || next == 'C'){
                           
                            total += values.get(next) - values.get(splited[i]);
                            i++;
                            break;
                        }
                    case 'C':
                        if(next == 'D' || next == 'M'){
                           
                            total += values.get(next) - values.get(splited[i]);
                            i++;
                            break;
                        }
                        total += values.get(splited[i]);
                    default:
                        //should not get here
                        break;
                }
            }
        }
        return total;
    }

    private boolean maybePrefix(char ch){
        switch(ch) {
            case 'I':
            case 'X':
            case 'C':
                return true;
            default:
                return false;
        }
    }
}
