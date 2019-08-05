package main.java;

public class A013_ReOrderArray {
    public void reOrderArray(int [] array) {
        if(array.length <= 1){
            return;
        }

        for(int i = array.length-1; i >= 0; i--){
            for(int j = i; j < array.length-1; j++){
                if(array[j] % 2 == 0 && array[j+1] % 2 == 1){
                    swap(array, j, j+1);
                }
            }
        }
    }

    public void swap(int[] array, int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
