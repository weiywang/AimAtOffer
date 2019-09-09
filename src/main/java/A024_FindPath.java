package main.java;

import java.util.*;

public class A024_FindPath {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        reallyFindPath(0, res, root, new LinkedList<Integer>(), target);

        res.sort(Comparator.comparingInt(list-> -list.size()));
        return res;
    }

    public void reallyFindPath(int pathSum, ArrayList<ArrayList<Integer>> res,
                               TreeNode root, LinkedList<Integer> path, int target){
        if(root == null){
           return;
        }

        if(pathSum > target){
            return;
        }

        if(pathSum+root.val == target && root.left == null && root.right == null){
            ArrayList<Integer> resPath = new ArrayList<Integer>(path);
            resPath.add(root.val);
            res.add(resPath);
        }

        path.addLast(root.val);

        if(root.left != null){
            reallyFindPath(pathSum+root.val, res, root.left, path, target);
        }

        if(root.right != null){
            reallyFindPath(pathSum+root.val, res, root.right, path, target);
        }

        path.removeLast();
    }
}
