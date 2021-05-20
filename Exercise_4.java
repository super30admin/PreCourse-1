// Time Complexity : O(n) as we have to traverse the complete tree in the worst case
// Space Complexity : O(n) for tree of n elements
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

import java.util.LinkedList;
import java.util.Queue;

public class Exercise_4 {

    /* A binary tree node has key, pointer to  
    left child and a pointer to right child */
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

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp) {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    /*function to insert element in binary tree */
    static void insert(Node temp, int key) {
        /**Queue is used to implement the BFS traversal of the tree and inserted the element
         as soon as empty space is found. **/

        // Do level order traversal until we find 
        // an empty place and add the node.
        Node newNode = new Node(key);

        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current.left!=null){
                queue.add(current.left);
            } else{
                current.left = newNode;
                break;
            }
            if(current.right!=null){
                queue.add(current.right);
            } else{
                current.right = newNode;
                break;
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