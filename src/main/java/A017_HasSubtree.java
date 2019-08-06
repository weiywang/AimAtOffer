package main.java;

import java.util.LinkedList;

public class A017_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2 == null){
            return false;
        }

        LinkedList<TreeNode> pipeLine = new LinkedList<>();
        pipeLine.addLast(root1);

        while(!pipeLine.isEmpty()){
            TreeNode root = pipeLine.pop();
            if(root == null){
                continue;//return false;是导致错误的原因，且自己没有找到这个错误
                         //有节点为null是正常的，pipeLine中还有不为null的节点
            }

            pipeLine.addLast(root.left);
            pipeLine.addLast(root.right);

            if(root.val == root2.val && isSub(root, root2)){
                return true;
            }
        }
        return false;
    }

    public boolean isSub(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(subRoot == null){
            return true;
        }

        if(root.val == subRoot.val) {
            return isSub(root.left, subRoot.left) && isSub(root.right, subRoot.right);
        }
        return false;
    }
}
