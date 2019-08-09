package main.java;

import java.util.*;

public class A019_PrintMatrix {

    //My Version, Success
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix.length == 0){
            return null;
        }
        if(matrix.length == 1){
            for(int i = 0; i < matrix[0].length;i++){
                res.add(matrix[0][i]);
            }
            return res;
        }

        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        for(;top <= bottom && left <= right;){

            if(top == bottom){
                for(int i = left;i <= right;i++){
                    res.add(matrix[top][i]);
                }
                break;
            }

            if(left == right){
                for(int i = top;i <= bottom;i++){
                    res.add(matrix[i][left]);
                }
                break;
            }

            for(int i = left;i <= right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i = top;i <= bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;

            for(int i = right;i >= left;i--){
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom;i >= top;i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
