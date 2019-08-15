package main.java;

import java.util.LinkedList;

public class A021_IsPopOrder {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if(pushA.length != popA.length){
            return false;
        }

        if(pushA.length == 0){
            return false;
        }

        LinkedList<Integer> stack = new LinkedList<>();

        int j = 0;
        for(int num : pushA){
            stack.add(num);

            //为什么不用getLast()，而用peekLast()？
            //在stack为空的情况下，peekLast()返回null,而getLast()抛异常
            while (stack.peekLast() != null && stack.getLast() == popA[j]){
                j++;
                stack.removeLast();
            }
        }

        return stack.isEmpty();
    }
}
