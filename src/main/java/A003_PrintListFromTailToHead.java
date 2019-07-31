package main.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class A003_PrintListFromTailToHead {

    // stack method
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        LinkedList<Integer> stack = new LinkedList<>();
//
//        while(listNode != null){
//            stack.addLast(listNode.val);
//            listNode = listNode.next;
//        }
//
//        ArrayList<Integer> res = new ArrayList<>();
//
//        while(!stack.isEmpty()){
//            res.add(stack.pollLast());
//        }
//
//        return res;
//    }

    // 递归方法
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        print(res, listNode);
        return res;
    }

    public void print(ArrayList<Integer> res, ListNode listNode){
        if(listNode == null){
            return;
        }
        print(res, listNode.next);
        res.add(listNode.val);
    }
}
