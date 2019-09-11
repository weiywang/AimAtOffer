package main.java;

import java.util.ArrayList;

public class Test {
    public static void main(String[] Args){
        char[] chars = {'a','b','c'};

        String res = new String(chars);

        String str = new String(chars);

        ArrayList<String> list = new ArrayList<>();

        list.add(res);

        System.out.println(list.contains(str));

        System.out.println(res);
    }
}
