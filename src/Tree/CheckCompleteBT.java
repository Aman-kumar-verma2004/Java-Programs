package Tree;

public class CheckCompleteBT {
    static Node root;
    public static void main(String[] args) {
        CheckCompleteBT t = new CheckCompleteBT();
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
//        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int totalNode = countNode(root);
        boolean res = checkCompleteBT(root, 0, totalNode);
        System.out.println(res);
    }
    static int countNode(Node root){
        if(root == null){
            return 0;
        }
        return 1+countNode(root.left)+countNode(root.right);
    }
    static boolean checkCompleteBT(Node root, int index, int totalNode){
        if(root == null) return true;

        if(index >= totalNode) return false;

        return checkCompleteBT(root.left, 2 * index +1, totalNode) && checkCompleteBT(root.right, 2 * index +2 , totalNode);
    }

}
