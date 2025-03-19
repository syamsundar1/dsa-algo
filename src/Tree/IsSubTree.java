package Tree;

import java.util.List;

public class IsSubTree {


    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);


        TreeNode subTree = new TreeNode(4);
        subTree.left = new TreeNode(1);
        subTree.right = new TreeNode(2);


        // Get the zigzag level order traversal
        System.out.println(IsSubTree.isSubtree(root, subTree));

    }


    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return false;
        return dfs(root,subRoot);
    }

    public static boolean dfs(TreeNode root, TreeNode subRoot){
        if(root == null || subRoot == null) return false;

        if(root.val == subRoot.val){
            boolean sameTrees = isSameTrees(root, subRoot);
            return sameTrees;
        }

        if(root.left != null) dfs(root.left, subRoot);
        if(root.right != null) dfs(root.right, subRoot);
        return false;
    }

    public static boolean isSameTrees(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot==null) return true;
        if(root == null || subRoot==null) return false;

        if(root.val != subRoot.val) return false;
        if(!isSameTrees(root.left, subRoot.left)) return false;
        if(!isSameTrees(root.right, subRoot.right)) return false;

        return true;
    }

}
