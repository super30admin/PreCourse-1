/*
Author: Akhilesh Borgaonkar
Problem: Java function to insert element in binary tree.
Approach: Used Level Order Traversal to find the first empty space in the BT. To maintain a queue for determining
    next nodes for exploration level wise, I am using a queue here.
Time complexity: O(logn) where n is number of nodes currently in the BT.
Space complexity: O(n) where n is number of nodes currently in the BT.
Verified functionality on local machine.
*/

import java.util.LinkedList;
import java.util.Queue;

public class Exercise_4 {

    public static class GFG {

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

            // Do level order traversal until we find
            // an empty place and add the node.
            Queue<Node> nodesQ = new LinkedList<Node>();    //using queue for BFS
            nodesQ.add(temp);                               //put head node in queue

            while(!nodesQ.isEmpty()){
                temp = nodesQ.poll();           //remove node from queue for exploration

                if(temp.left==null){            //check if left node is empty
                    temp.left = new Node(key);
                    break;
                } else {
                    nodesQ.offer(temp.left);    //not empty then add in queue for exploration
                }

                if(temp.right==null){           //check if right node is empty
                    temp.right = new Node(key);
                    break;
                } else {
                    nodesQ.offer(temp.right);   //not empty then add in queue for exploration
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
}
