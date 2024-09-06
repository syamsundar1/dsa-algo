package Tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderRecuersive {

   static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Node node = new Node(1,new Node(2), new Node(3));
        inOrderRecuersive(node);
        System.out.println(ans);
    }

    public static void inOrderRecuersive(Node node) {
        if(node==null){
            return;
        }
        inOrderRecuersive(node.left);
        ans.add(node.val);
        inOrderRecuersive(node.right);

    }
}


class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }

    Node(int val,Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}