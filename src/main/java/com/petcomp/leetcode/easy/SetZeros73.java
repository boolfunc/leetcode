package com.petcomp.leetcode.easy;

public class SetZeros73 {

    public void setZeros(int[][] matrix){
        boolean rowFlag = false;
        boolean colFlag = false;
        for(int i = 0; i < matrix.length; i++){

            if (matrix[i][0] == 0){
                colFlag = true;
                break;
            }

        }
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                rowFlag = true;
                break;
            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);



        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if (matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
                if (matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if (colFlag){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if (rowFlag){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }


    }


}
