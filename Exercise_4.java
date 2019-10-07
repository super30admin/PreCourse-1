
import java.util.Iterator;
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

        // Do level order traversal until we find 
        // an empty place and add the node.
    	
    	// using queue as temp data structure to find
    	// empty slot in the tree
    	
    	// add root node to queue
    	Queue<Node> tempQ = new LinkedList<Node>();
    	tempQ.add(temp);
    	
    	while (!tempQ.isEmpty()) {
    		
    		// get the node from head
    		Node aNode = tempQ.peek(); 
    		   		
    		// remove the node from head
    		tempQ.remove();

    		// check left side
    		if (aNode.left == null) {
    			// no left means we can attach new node to left
    			// and break out of the loop
    			aNode.left = new Node(key);
    			break;
    		} else {
    			// left present means add it queue 
    			tempQ.add(aNode.left);
    		}
    		
    		// check right side
    		if (aNode.right == null) {
    			// attach to right and break out of the loop
    			aNode.right = new Node(key);
    			break;
    		} else {
    			tempQ.add(aNode.right);
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

        System.out.print("\nInorder traversal after insertion 1:"); 
        insert(root, key); 
        inorder(root);
        
        root.left.left.left = new Node(99);
        root.left.left.right = new Node(123);
        
       
        insert(root, 1001);
        System.out.print("\nInorder traversal after insertion 2:");
        inorder(root);
        
        
        //inorder(root); 
    } 
}
