package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree program!");

        BinaryTree<Integer> bst = new BinaryTree<>();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(60);
        bst.insert(95);
        bst.insert(11);
        bst.insert(3);
        bst.insert(16);
        bst.insert(65);
        bst.insert(63);
        bst.insert(67);

        // Print the tree traversal
        bst.inorder();
        System.out.println();
        bst.preorder();
        System.out.println();
        bst.postorder();

        System.out.println("\nSize of the BST: " + bst.getSize());

        // UC 3: Search for a specific number in the BST
        int numberToSearch = 63;
        boolean isFound = bst.search(numberToSearch);
        System.out.println("Is " + numberToSearch + " present in the BST: " + isFound);
    }
}
