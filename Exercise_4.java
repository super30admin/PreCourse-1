//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : haven't tried
//Any problem you faced while coding this : I understand the logic but still not intuitive

//Your code here along with comments explaining your approach

import java.util.LinkedList; 
import java.util.Queue; 
class GFG { 
       
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
    	
    	// create a queue of Node type to store btree node
    	Queue<Node> btreeQueue = new LinkedList<Node>();
    	// add node to queue
    	btreeQueue.add(temp);
    	
    	// traverse through queue of btree node until find empty node
    	while(!btreeQueue.isEmpty()) {
    		// check first node in the queue, check its left node, if null add new key as Node
    		// if not null add that node to queue
    		temp = btreeQueue.peek();
    		//System.out.println(temp.key);
    		if(temp.left == null) {
    			temp.left = new Node(key);
    			//System.out.println("1L " + temp.left.key);
    			break;
    		}else {
    			//System.out.println("2L " + temp.left.key);
    			btreeQueue.add(temp.left);
    		}
    		
    		// check first node in the queue, check its right node, if null add new key as Node
    		// if not null add that node to queue
    		if(temp.right == null) {
    			temp.right = new Node(key);
    			//System.out.println("1R " + temp.right.key);
    			break;
    		}else {
    			//System.out.println("2R " + temp.right.key);
    			btreeQueue.add(temp.right);
    		}
    		// once checked remove node from queue
    		btreeQueue.remove();
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


