package q_07_ReConstructBinaryTree;

import java.util.Arrays;

/**
 * description:输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ReConstructBinaryTree {
    //前序遍历的作用是确定根节点，中序遍历用来确定左子树的节点和右子树的节点
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in){
        return reConstructBinaryTree(pre,in,0,pre.length-1,0,in.length-1);
    }
    private  static TreeNode reConstructBinaryTree(int [] pre,int [] in, int preStart,int preEnd,int inStart,int inEnd) {
        //确定根节点
        TreeNode treeNode = new TreeNode(pre[preStart]);
        if(preStart==preEnd||inStart==inEnd) return treeNode;

        //确定中序中当前根节点的下表
        for (int i = inStart; i <= inEnd; i++) {
            if(in[i] == pre[preStart]){
                //确定左子树的前序和中序
                treeNode.left = i==inStart?null:reConstructBinaryTree(pre,in,preStart+1,preStart+i-inStart,inStart,i-1);
                //确定右子树的前序和中序
                treeNode.right = i==inEnd?null:reConstructBinaryTree(pre,in,preStart+i-inStart+1,preEnd,i+1,inEnd);
                break;
            }
        }
        return treeNode;
    }


    public static void main(String[] args) {
        TreeNode treeNode = reConstructBinaryTree(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});
        System.out.println("ok");
    }
}



class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}