package main.java;

import java.util.Stack;

public class A005_StacksQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();
    }
}
