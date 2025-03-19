package Tree;

public class PreOrderDFS {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        dfs(node);
    }

    public static void dfs(TreeNode node){
        if(node == null) return;

        System.out.println(node.val);
        dfs(node.left);
        dfs(node.right);

    }
}
