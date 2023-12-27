package BinarySearchTree;

public class BinaryTree<T extends Comparable<T>> {
    INode<T> root;

    BinaryTree() {
        this.root = null;
    }

    void insert(T key) {
        this.root = insertRec(root, key);
    }

    INode<T> insertRec(INode<T> root, T key) {
        if (root == null) {
            root = new INode<>(key);
            return root;
        }

        if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(INode<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    //pre order traversal
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(INode<T> root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    //post order traversal
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(INode<T> root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
}