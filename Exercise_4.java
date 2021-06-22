import java.util.LinkedList;
import java.util.Queue;

class GFG {

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
        Node new_node = new Node(key);
        if (temp == null) {
            root = new_node;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(temp);
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.left == null) {
                node.left = new_node;
                return;
            }
            q.offer(node.left);

            if (node.right == null) {
                node.right = new_node;
                return;
            }
            q.offer(node.right);
        }

        // Do level order traversal until we find
        // an empty place and add the node.
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