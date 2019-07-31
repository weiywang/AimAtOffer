package main.java;

public class A001_Find {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0){
            return false;
        }
        for(int i = 0, j = array[0].length - 1; i < array.length && j >= 0;){
            if(array[i][j] < target){
                i++;
            }
            else if(array[i][j] > target){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
}
