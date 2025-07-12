package BinaryTree;
import java.sql.SQLOutput;
import java.util.*;


public class BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);// left subtree ke liye
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }

    public static void preOrderTrav(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrderTrav(root.left);
        preOrderTrav(root.right);


    }

    public static void inOrderTrav(Node root){
        if(root == null) return;
        inOrderTrav(root.left);
        System.out.print(root.data+" ");
        inOrderTrav(root.right);
    }

    public static void postOrderTrav(Node root){
        if(root == null) return;
        postOrderTrav(root.left);
        postOrderTrav(root.right);
        System.out.print(root.data+" ");

    }

    public static void levelOrderTrav(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println(root);

        System.out.println("root data :"+root.data);
        System.out.print("PreOrder traversal output : ");
        preOrderTrav(root);
        System.out.println();
        System.out.print("InOrder traversal output : ");
        inOrderTrav(root);
        System.out.println();
        System.out.print("PostOrder traversal output : ");
        postOrderTrav(root);
        System.out.println();
        System.out.println("LevelOrder traversal output : ");
        levelOrderTrav(root);
    }
}
