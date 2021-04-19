//Time Complexity worst case O(n)
package Default;
import java.util.Queue; 
import java.util.LinkedList;

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
    	
    	
    	if(temp == null) {
    		
    		temp = new Node(key);
    		return;
    	}
    	
    	Queue<Node> q = new LinkedList<Node>();
    	q.add(temp);
    	
    	while(!q.isEmpty()) {
    		
    		Node temp1 = q.remove();
    		
    		if(temp1.left == null) {
    			
    		Node temp3 = new Node(key);
    		temp1.left = temp3;
    		break;
    			
    		}
    		else q.add(temp1.left);
    		
    		if(temp1.right == null) {
    			
        		Node temp3 = new Node(key);
        		temp1.right = temp3;
        		break;
        			
        		}
        		else q.add(temp1.right);
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