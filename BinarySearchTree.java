public class BinarySearchTree {

    // Node class for a binary search tree.
    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // Root of the binary search tree.
    private Node root;

    // Inserts a new element into the binary search tree.
    public void insert(int value) {
        root = insertHelper(root, value);
    }

    // Helper function for inserting a new element into the binary search tree.
    private Node insertHelper(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insertHelper(node.left, value);
        } else {
            node.right = insertHelper(node.right, value);
        }
        return node;
    }

    // Searches for the given element in the binary search tree.
    // Returns true if the element is found, false otherwise.
    public boolean search(int value) {
        return searchHelper(root, value);
    }

    // Helper function for searching for an element in the binary search tree.
    private boolean searchHelper(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        } else if (value < node.value) {
            return searchHelper(node.left, value);
        } else {
            return searchHelper(node.right, value);
        }
    }
}
