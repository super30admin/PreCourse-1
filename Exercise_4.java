// Time Complexity :O(n) where n is the number of nodes
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : Writing the looping statements while inserting 

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
        Node newNode = new Node(key);
        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);
        queue.add(null);
        // Do level order traversal until we find 
        // an empty place and add the node.
        while(!queue.isEmpty()){
            Node t = queue.poll();
        while(t!= null){
            if(t.left==null){
                t.left=newNode;
                return;
            }
            else if(t.right==null){
                t.right =newNode;
                return;
            }
            else{
                queue.add(t.left);
                queue.add(t.right);
            }
            t=queue.poll();

        }
        if(!queue.isEmpty())
            queue.add(null);


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