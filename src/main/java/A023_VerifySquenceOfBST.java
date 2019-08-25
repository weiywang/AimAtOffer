package main.java;

public class A023_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0){
            return false;
        }
        if(sequence.length == 1){
            return true;
        }

        return isBinaryTree(sequence, 0, sequence.length-1);
    }

    public boolean isBinaryTree(int[] sequence, int start, int end){
        if(start < 0 || end < 0 || start > end){
            return true;
        }

        int rootV = sequence[end];
        int rightIndex = -1;
        int rightV = Integer.MIN_VALUE;

        for(int i = start; i < end; i++){

            //对于左子树的点，如果都正常小于根节点的话会跳过

            //这个条件目的是在找第一个大于根节点的index
            if(rightV == Integer.MIN_VALUE && sequence[i] > rootV){
                rightIndex = i;
                rightV = sequence[i];
                continue;
            }

            if(rightV != Integer.MIN_VALUE && sequence[i] < rootV){
                return false;
            }
        }

        return isBinaryTree(sequence, start, rightIndex-1) && isBinaryTree(sequence, rightIndex, end-1);
    }
}
