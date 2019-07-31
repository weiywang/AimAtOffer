package main.java;

import java.util.*;//有用到直接用*，省的一个一个加

public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        Map<Integer, Integer> preIndex = new HashMap<>();
        for(int i = 0; i < pre.length; i++){
            preIndex.put(pre[i], i);
        }

        return buildTree(preIndex, in, 0, in.length-1);
    }

    public TreeNode buildTree(Map<Integer, Integer> preIndex, int[] in, int start,int end){
        if(start == end){
            return new TreeNode(in[start]);
        }
        int indexOfRoot = start;
        for(int i = start; i <= end; i++){
            if(preIndex.get(in[i]) < preIndex.get(in[indexOfRoot])){
                indexOfRoot = i;
            }
        }
        TreeNode root = new TreeNode(in[indexOfRoot]);
        if(start <= indexOfRoot-1){//<= 边界值
            root.left = buildTree(preIndex, in, start, indexOfRoot -1);
        }
        if(indexOfRoot+1 <= end){
            root.right = buildTree(preIndex, in, indexOfRoot+1, end);
        }
        return root;
    }
}
