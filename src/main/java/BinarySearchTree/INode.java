package BinarySearchTree;

public class INode<T extends Comparable<T>> {
    T key;
    INode<T> left, right;

    public INode(T item) {
        this.key = item;
        this.left = this.right = null;
    }
}