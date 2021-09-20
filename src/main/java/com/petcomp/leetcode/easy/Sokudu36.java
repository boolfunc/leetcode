package com.petcomp.leetcode.easy;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Sokudu36 {

    public boolean isValidSokudu(char[][] board){
        for(int i = 0; i < 9; i++){
            Map<Character, Integer> row = new HashMap<>();
            for(int j = 0; j < 9; j++){
                if (row.get(board[i][j]) == null || row.get(board[i][j]) == '.'){
                    row.put(board[i][j], 1);
                }else{
                    return false;
                }
            }
        }

        for(int j = 0; j < 9; j++){
            Map<Character, Integer> col = new HashMap<>();
            for(int i = 0; i < 9; i++){
                if(col.get(board[i][j]) == null  || col.get(board[i][j]) == '.'){
                    col.put(board[i][j], 1);
                }else{
                    return false;
                }

            }
        }

        for(int i = 0; i < 9; i=i+3){
            for(int j = 0; j < 9; j=j+3){
                Map<Character, Integer> cub = new HashMap<>();

                for(int k = i; k < i+3; k++){
                    for(int m = j; m < j+3; m++){
                       if (cub.get(board[k][m]) == null || board[k][m] == '.'){
                           cub.put(board[k][m], 1);
                       }else{
                           return false;
                       }

                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 9; i=i+3){
            for(int j = 0; j < 9; j=j+3){
                Map<Character, Integer> cub = new HashMap<>();

                for(int k = i; k < i+3; k++){
                    for(int m = j; m < j+3; m++){
                        System.out.print(k + " " + m + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
