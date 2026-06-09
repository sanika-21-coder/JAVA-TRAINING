public class BinarySearchTree {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    Node root;

    void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.root = new Node(2);

        tree.root.left = new Node(10);
        tree.root.right = new Node(15);

        tree.root.left.left = new Node(28);
        tree.root.left.right = new Node(34);

        tree.root.right.left = new Node(46);
        tree.root.right.right = new Node(52);

        tree.root.left.left.left = new Node(59);
        tree.root.left.left.right = new Node(63);

        tree.root.left.right.left = new Node(73);
        tree.root.left.right.right = new Node(75);

        tree.root.right.left.left = new Node(80);
        tree.root.right.left.right = new Node(89);

        tree.root.right.right.left = new Node(96);

        System.out.print("Preorder: ");
        tree.preorder(tree.root);

        System.out.println();

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
    }
}
