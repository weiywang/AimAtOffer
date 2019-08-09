package main.java;

import java.util.*;

public class A020_MInStack {

    Stack<Integer> innerStack;
    Stack<Integer> minStack;

    public A020_MInStack(){
        innerStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int node) {
        innerStack.push(node);
        if(minStack.isEmpty() || node <= minStack.peek()){
            minStack.push(node);
        }
    }

    public void pop() {
        if(!innerStack.isEmpty()){
            Integer popValue = innerStack.pop();
            if(popValue.equals(minStack.peek())){
                minStack.pop();
            }
        }
    }

    public int top() {
        return innerStack.peek();
    }

    public int min() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }else {
            return -1;
        }
    }
}
