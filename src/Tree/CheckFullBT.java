package Tree;

public class CheckFullBT {
    static Node root;
    public static void main(String[] args) {
        CheckFullBT t = new CheckFullBT();
        t.root = new Node(10);
        t.root.left = new Node(20);
        t.root.right = new Node(30);
        t.root.left.left = new Node(40);
        t.root.left.right = new Node(50);
        t.root.right.left = new Node(60);
        t.root.right.right = new Node(70);
        boolean res = checkFullBT(root);
        System.out.println(res);

    }
    static boolean checkFullBT(Node root){
        if(root == null){
            return true;
        }else if(root.left == null && root.right == null) {
            return true;
        }else if(root.left != null && root.right != null){
            return checkFullBT(root.left) && checkFullBT(root.right);
        }
        return false;
    }
}
