package q_19_mirror;

/*
操作给定的二叉树，将其变换为源二叉树的镜像。
 */


import Util.TreeNode;

public class Mirror {
    public void Mirror(TreeNode root) {
        if(root==null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        Mirror(left);
        Mirror(right);
        //也可写成下面这样，好处是提前进行判断，减少了一层递归，但上层会多判断下
//        if(left!=null) Mirror(left);
//        if(right!=null) Mirror(right);
    }
}
