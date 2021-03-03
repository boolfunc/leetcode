package com.petcomp.leetcode.easy;

public class ReverseInt {
    
    public int reverse(int num){

        int result = 0;

        while(num != 0){
            int factor = num % 10;

            if(Math.abs(result) > Integer.MAX_VALUE / 10){
                return 0;
            }
            if(Math.abs(result) == Integer.MAX_VALUE / 10 && (num / 10) % 10 > Integer.MAX_VALUE % 10){
                return 0;
            }

            result = result * 10 + factor;
            num = num / 10;

      
        }
        return result;
    }
}
