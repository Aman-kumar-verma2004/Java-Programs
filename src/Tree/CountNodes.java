package Tree;

public class CountNodes {
    static Node root;
    public static void main(String[] args) {
        CountNodes t = new CountNodes();
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int res =  countNodes(root);
        System.out.println("Total No of Nodes are : "+res);
    }
    static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1+countNodes(root.left) + countNodes(root.right);
    }
}
