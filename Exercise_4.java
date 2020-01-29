import java.util.LinkedList;
import java.util.Queue;

public class GFG {

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

    /* function to insert element in binary tree */
    /* TIme compplexity - O(n/2), Space complexity - O(n) */
    static void insert(Node temp, int key) {
        // Do level order traversal until we find
        // an empty place and add the node.
        Queue<Node> queue = new LinkedList<>(); // declaring a queue to store the nodes for level order traversal
        if (temp == null) { // checking is the root is null if so creating new root node
            root = new Node(key);
            return;
        } else
            queue.add(temp); // if root is not null adding it to the queue
        while (!queue.isEmpty()) { // when queue is not empty checking for empty node
            temp = queue.poll(); // removing the head of queue
            /*
             * checking for empty node on left and right if found then creating the new
             * node. else adding the left or/and right nodes to queue
             */
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                queue.add(temp.left);
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                queue.add(temp.right);
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