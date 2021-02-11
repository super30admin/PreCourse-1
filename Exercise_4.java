package preCourse1;

import java.util.LinkedList;
import java.util.Queue;

public class InsertInBinaryTree {

    /*
     * A binary tree node has key, pointer to left child and a pointer to right
     * child
     */
    static class Node {
        int key;
        Node left, right;

        // constructor
        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp = root;

    /* Inorder traversal of a binary tree */
    static void inorder(Node temp) {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    static void insert(Node temp, int key) {
        Queue<Node> que = new LinkedList<>();

        que.add(temp);

        Node newNode = new Node(key);

        for (int i = 0; i < que.size(); i++) {
            Node removedNode = que.remove();
            if (removedNode.left == null) {
                removedNode.left = newNode;
                return;
            } else if (removedNode.right == null) {
                removedNode.right = newNode;
                return;
            } else {
                que.add(removedNode.left);
                que.add(removedNode.right);
            }
        }

    }

    // Driver code
    public static void main(String args[]) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("Inorder traversal before insertion:");
        inorder(root);

        int key = 12;
        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }

}
