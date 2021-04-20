import java.util.LinkedList;
import java.util.Queue;
public class GFG {

    /* A binary tree node has key, pointer to
    left child and a pointer to right child */
    static class Node {
        int key;
        Node left, right;

        // constructor
        Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }

    /*function to insert element in binary tree */
    static void insert(Node root, int key)
    {
        if(root == null) return;

        Node node = new Node(key);

        // Do level order traversal until we find
        // an empty place and add the node.
        Queue<Node> queue = new LinkedList<>();
        // staring the traversal with root value.
        queue.add(root);

        while(!queue.isEmpty()){
            // Length which indicates the number of elements in the current level.
            int length = queue.size();

            // Traverse the current level to populate the next level elements into the traverse queue.
            for (int i = 0; i < length; i++) {
                Node curr = queue.poll();

                // Checking if the left pointer is empty.
                // If not empty add it to the queue for performing level order traversal.
                // If empty found the position at which the element has to be Inserted.
                if (curr.left != null) {
                    queue.add(curr.left);
                } else {
                    curr.left = node;
                    return;
                }

                // Checking if the right pointer is empty.
                // If not empty add it to the queue for performing level order traversal.
                // If empty found the position at which the element has to be Inserted.
                if (curr.right != null) {
                    queue.add(curr.right);
                } else {
                    curr.right = node;
                    return;
                }
            }
        }
    }

    // Driver code
    public static void main(String args[])
    {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print( "Inorder traversal before insertion:");
        inorder(root);

        int key = 12;
        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}