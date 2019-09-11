package main.java;

public class A026_Convert {
    protected TreeNode leftLast = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }

        if(pRootOfTree.left == null && pRootOfTree.right == null){
            leftLast = pRootOfTree;
            return pRootOfTree;
        }

        TreeNode left = Convert(pRootOfTree.left);

        if(left != null){
            leftLast.right = pRootOfTree;
            pRootOfTree.left = leftLast;
        }

        leftLast = pRootOfTree;

        TreeNode right = Convert(pRootOfTree.right);


        //这里的pRootOfTree不能用leftLast代替
        //没想明白原因，但是实验之后确实如此！！！
        if(right != null){
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }

        return left != null ? left : pRootOfTree;
    }
}
