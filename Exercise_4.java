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
    //Approach: I have used queue to iterate through the tree, checking on the left and right child of tree,
    //if I find anyone of them to be empty, I will create a node with the "key" and place it there, then break the loop and return. 
    /*function to insert element in binary tree */
    static void insert(Node temp, int key) 
    { 

        // Do level order traversal until we find 
        // an empty place and add the node.  
    	Node node = new Node(key);
    	if(temp == null)
    	{
    		root = node;
    		return;
    	}
    	Queue<Node> queue = new LinkedList<Node>();
    	queue.add(temp);
    	while(!queue.isEmpty())
    	{
			Node curr = queue.poll();
			if(curr.left == null)
			{
				curr.left = node;
				break;
			}else
				queue.add(curr.left);
			if(curr.right == null)
			{
				curr.right = node;
				break;
			}
			else 
    			queue.add(curr.right);	
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
 // Time Complexity : O(N), by worst case scenario we might end up traversing all the nodes of the tree to insert a node.
 // Space Complexity : O(N), since I have used Queue to traverse through the tree.
 // Did this code successfully run on Leetcode : NA
 // Any problem you faced while coding this : Initially, my new key node was getting inserted at all the empty places, then I stopped running in a for loop,
    // and did break when the key node was placed once in the tree.
}