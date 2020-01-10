package q_18_hasSubtree;

//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）


import Util.TreeNode;

public class HasSubtree {
    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null) return false;
        if (subTree(root1,root2)) return true;
        if(HasSubtree(root1.left,root2)) return true;
        if(HasSubtree(root1.right,root2)) return true;
        return false;
    }

    public static boolean subTree(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null) return false;
        if(root1.val!=root2.val) return false;
        if(!subTree(root1.left, root2.left)) return false;
        if(!subTree(root1.right, root2.right)) return false;
        return true;
    }

    public static TreeNode setLTree(TreeNode root,TreeNode left){
        root.left = left;
        return left;
    }
    public static TreeNode setRTree(TreeNode root,TreeNode right){
        root.right = right;
        return right;
    }

    public static void main(String[] args) {
        TreeNode mainRoot = new TreeNode(8);
        TreeNode treeNode = mainRoot.setLeft(new TreeNode(8));
        treeNode.setLeft(new TreeNode(9));
        TreeNode treeNode1 = treeNode.setRight(new TreeNode(2));
        treeNode1.setLeft(new TreeNode(4));
        treeNode1.setRight(new TreeNode(7));
        mainRoot.setRight(new TreeNode(7));
        TreeNode subRoot = new TreeNode(8);
        subRoot.setLeft(new TreeNode(9));
        subRoot.setRight(new TreeNode(2));
        System.out.println(HasSubtree(mainRoot, subRoot));
        System.out.println(HasSubtree(treeNode, subRoot));
    }
}
