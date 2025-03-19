package Tree;

public class PostOrderDFS {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        dfs(node);
    }

    public  static void dfs(TreeNode node){
        if(node == null) return;

        dfs(node.left);
        dfs(node.right);
        System.out.println(node.val);
    }

}


