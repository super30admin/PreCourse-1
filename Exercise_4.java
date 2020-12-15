/**
 * Time Complexity: O(N) where N is number of nodes in the binary tree 
 * Space Complexity: O(N) where N is number of nodes in the binary tree 
 */
import java.util.LinkedList;
import java.util.Queue;

public class Exercise_4 {

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
    static void insert(Node temp, int key) {

        // Do level order traversal until we find
        // an empty place and add the node.

        // Initialize Queue
        Queue<Node> q = new LinkedList<Node>();

        // Add root to the queue
        q.add(root);

        // Iterate until queue is empty i.e. entire tree is traversed
        while (!q.isEmpty()) {
            // remove the first node in the queue
            Node firstNode = q.poll();

            // check if the removed node has an empty left child
            // if the left child is empty then insert the new node with passed key as the
            // left child of that node
            if (firstNode.left == null) {
                firstNode.left = new Node(key);
                break;
            }
            // check if the removed node has an empty right child
            // if the right child is empty then insert the new node with passed key as the
            // right child of that node
            if (firstNode.right == null) {
                firstNode.right = new Node(key);
                break;
            }

            // if there is already a left child of firstNode then enqueue the left child
            q.offer(root.left);

            // if there is already a left child of firstNode then enqueue the right child
            q.offer(root.right);
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