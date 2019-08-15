package main.java;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;



//题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
public class A022_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {



        //下面注释这种写法是错误的，在root为null时，应该返回空的ArrayList，而不应该返回null
//        if(root == null){
//            return null;
//        }
//
//        ArrayList<Integer> res = new ArrayList<>();

        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }

        return res;
    }
}
