package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree program!");

        BinaryTree<Integer> bst = new BinaryTree<>();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        // Print the tree traversal
        bst.inorder();
        System.out.println();
        bst.preorder();
        System.out.println();
        bst.postorder();
    }
}
