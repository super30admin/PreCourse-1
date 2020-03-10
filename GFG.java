// Time Complexity : insert O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : not tried
// Any problem you faced while coding this : no

import java.util.Stack;

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

        // Do level order traversal until we find 
        // an empty place and add the node. 
    	Node node = new Node(key);
    	if(temp == null) {
    		root = node;
    	}else {
        	Stack<Node> st = new Stack();
        	st.push(temp);
        	Node tmp = null;
        	while(!st.isEmpty()) {
        		tmp = st.pop();
        		if(tmp.left != null) st.push(tmp.left);
        		if(tmp.right != null) st.push(tmp.right);
        	}
        	tmp.left = node;
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