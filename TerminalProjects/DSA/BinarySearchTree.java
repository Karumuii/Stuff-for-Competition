package TerminalProjects.DSA;

public class BinarySearchTree {
    static Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    void insert(int value) {
        root = insertNode(root, value);
    }

    Node insertNode(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.data) {
            node.left = insertNode(node.left, value);
        } else if (value > node.data) {
            node.right = insertNode(node.right, value);
        }
        return node;
    }

    void display(Node node) { // In-order traversal (Sorted output)
        if (node == null)
            return;
        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(45);
        tree.insert(15);
        tree.insert(79);
        tree.insert(90);
        tree.insert(1);
        tree.insert(10);

        System.out.print("Tree (In-order): ");
        tree.display(root); // Output will be sorted: 1 10 15 45 79 90
    }
}
