package com.petcomp.leetcode.easy;


public class PlusOne66 {

    public int[] plusOne(int[] digits){
        if (digits[digits.length - 1] < 9){
            digits[digits.length-1] = digits[digits.length - 1] + 1;
            return digits;
        }

        boolean allNine = true;
        for(int i = 0; i < digits.length; i++){

            if (digits[i] != 9){
                allNine = false;
            }
        }

        if (allNine){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i < result.length; i++){
                result[i] = 0;
            }
            return result;
        }else{

            for(int i = digits.length - 1; i >= 0; i--){
                if (digits[i] == 9){
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
        }

        return digits;

    }
}
