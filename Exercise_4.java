/*
 * Time Complexity: 
 * 		Insertion() -> O (N) -> level order traversal of all elements in a binary tree to find a null place
 * 		Traversal() -> O (N) -> Traverse through all elements
 * 
 * Space Complexity: O (N)
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.precourse1;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise_4 {
	
	/* A binary tree node has key, pointer to  
    left child and a pointer to right child */
	
    static class Node { 
        int key; 
        Node left, right; 
          
        // constructor 
        /*
         * Initialize the key to a value
         * left and right pointers of a tree to null
         */
        Node(int key){ 
            this.key = key; 
            left = null; 
            right = null; 
        } 
    } 
    
    static Node root; // InitiaLize the root node 
    static Node temp = root; // Assign root node to temp node
      
    
    /* Inorder traversal of a binary tree in a recursive way*/
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        /*
         * Apply inorder traversal recursively on left and right subtrees
         * Inorder traversal:
         * 	left -> root -> right
         */
        inorder(temp.left); 
        System.out.print(temp.key+" "); 
        inorder(temp.right); 
        
    } 
       
    /*function to insert element in binary tree */
    static void insert(Node temp, int key) 
    { 

        // Do level order traversal until we find 
        // an empty place and add the node.  
    	
    	/*
    	 * Level order traversal is BFS -> implemented using queue
    	 * Here, we are doing level order traversal in iterative way using queue
    	 * until we find a first null place to insert the key/element
    	 * 
    	 * Since, for inserting element, we have to traverse all elements to find a null place 
    	 * time complexity for insertion in binary tree is: O (N)
    	 * 
    	 */
    	
    	Queue<Node> q = new LinkedList<Node>();
    	q.add(temp); // Add root/temp in a queue
    	
    	/*
    	 * while queue is not empty, pop the front element (FIFO) from queue and check its left and right elements
    	 * If any of the left or right elements of popped element is null, insert the new element and exit out of while loop
    	 * else, add the left and right elements in a queue
    	 * Repeat the process until a null position is found
    	 * 
    	 */
    	
    	while(!q.isEmpty()) {
    		temp = q.peek();
    		q.remove();
    		
    		if(temp.left == null) {
    			temp.left = new Node(key);
    			break;
    		}else {
    			q.add(temp.left);
    		}
    		
    		if(temp.right == null) {
    			temp.right = new Node(key);
    			break;
    		}else {
    			q.add(temp.right);
    		}
    	}
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
    	/*
    	 * Create a binary tree with root node - 10
    	 */
        root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root); // o/p -> 7 11 10 15 9 8
       
        int key = 12; // element to be inserted
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root); // 7 11 12 10 15 9 8
    } 
    
}
