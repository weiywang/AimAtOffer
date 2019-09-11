package main.java;

import java.util.*;


//complete by myself
public class A027_Permutation {
    protected ArrayList<String> res = new ArrayList<>();

    protected char[] chars;

    protected int n;

    public ArrayList<String> Permutation(String str) {
        n = str.length();
        chars = new char[n];

        chars = str.toCharArray();

        backTrack(0);



        return res;
    }

    public void backTrack(int t){
        if(t >= n){
            String temp = new String(chars);
            if(!res.contains(temp)) {
                res.add(temp);
                System.out.println(res);
            }
            return;
        }else{
            for(int i = t; i < n; i++){
                swap(t, i);
                backTrack(t+1);
                swap(t, i);
            }
        }
    }

    public void swap(int i, int j){
        char temp;
        temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
    }

    public static void main(String[] Args){
        char[] chars = {'a','a'};

        String res = new String(chars);

        A027_Permutation permutation = new A027_Permutation();

        permutation.Permutation(res);
    }

}
