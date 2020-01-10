package Util;

public class TreeNode {
    public int val = 0;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
    public TreeNode setLeft(TreeNode left) {
        this.left = left;
        return left;
    }
    public TreeNode setRight(TreeNode right) {
        this.right = right;
        return right;
    }
}