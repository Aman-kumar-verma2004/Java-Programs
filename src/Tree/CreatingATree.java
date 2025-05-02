package Tree;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class CreatingATree {
    static Node root;
    public static void main(String[] args) {
        CreatingATree t = new CreatingATree();
        t.root = new Node(10);
        t.root.left = new Node(20);
        t.root.right = new Node(30);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);

    }

    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + "\t");
            inOrder(root.right);
        }
    }
    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + "\t");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right
            );
            System.out.print(root.data + "\t");
        }
    }

}
