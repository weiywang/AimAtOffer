package main.java;

public class A006_MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }

        int start = 0, end = array.length-1;
        while(end - start != 1){
            int mid = (start + end)/2;

            if(array[mid] >= array[start]){
                start = mid;
            }
            if(array[mid] <= array[end]){
                end = mid;
            }
        }
        return array[end];
    }
}
