package BinarySearchTree;

public class BinaryTree<T extends Comparable<T>> {
    INode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T key) {
        this.root = insertRec(root, key);
    }

    public INode<T> insertRec(INode<T> root, T key) {
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

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(INode<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    //pre order traversal
    public void preorder() {
        preorderRec(root);
    }

    public void preorderRec(INode<T> root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    //post order traversal
    public void postorder() {
        postorderRec(root);
    }

    public void postorderRec(INode<T> root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // get size
    public int getSize() {
        return this.getSizeRec(root);
    }

    public int getSizeRec(INode<T> root) {
        if (root == null) {
            return 0;
        }
        return 1 + this.getSizeRec(root.left) + this.getSizeRec(root.right);
    }
}