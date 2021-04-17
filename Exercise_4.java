// Time Complexity :    O(n) // Worst case Need to traverse till end of the tree until you reach an empty spot
// Space Complexity :   O(n) // Extra memory for creating queue to do level order 
// Did this code successfully run on Leetcode : Did not find on leetcode
// Any problem you faced while coding this : No

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
    static void insert(Node temp, int key)
    {

        Queue<Node> queue = new LinkedList<>();        // Use Queue to do level order traversal as it uses FIFO
        if(temp==null){                            // If the node is empty insert the new key and terminate the program

            Node newNode= new Node(key);
            temp=newNode;
            return;

        }

        queue.add(temp);                       // Insert root first into the queue
        while(!queue.isEmpty()){              // Check if queue is not empty to keep traversing the entire tree

            Node tmpval =queue.peek();         // Get the top of the queue and pop it out. Then go left and right to do level order traversal
            queue.remove(tmpval);
            if(tmpval.left==null){            // Check if left node is empty first and if true insert node in the empty place and return

                Node newNode = new Node(key);
                tmpval.left=newNode;
                return;
            }

            queue.add(tmpval.left);        // If false then add it in queue and check if right node is empty.

            if(tmpval.right==null) {     //If true insert node in empty place

                Node newNode = new Node(key);
                tmpval.right = newNode;
                return;
            }
            queue.add(tmpval.right);      // If false add in the queue and repeat the process until queue is empty
        }



        // Do level order traversal until we find 
        // an empty place and add the node.  
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