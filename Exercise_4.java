// Exercise_4 : Insert an element in a Binary Tree.

// Time Complexity : O(N) afor insert and print
// Space Complexity : O(N) as we need a N objects of Node class connected with each other
// Did this code successfully run on Leetcode : Could not find it on leetcode. But ran successfully locally
// Any problem you faced while coding this : Miswrote on line 50 - Insert New node at end. Also, getting confused in picturing curr and curr.next when using while loops

import java.util.LinkedList; 
import java.util.Queue; 
public class Exercise_4 { 
       
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

        Node n = new Node(key);
        if(temp == null){
            root = n;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(temp);
        while(!q.isEmpty()){
            Node qTop = q.peek();
            q.remove();

            if(qTop.left == null){
                qTop.left = new Node(key);
                return;
            }else q.add(qTop.left);

            if(qTop.right == null){
                qTop.right = new Node(key);
                return;
            }else q.add(qTop.right);
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