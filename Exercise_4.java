// Time Complexity : O(n)
// Space Complexity : O(n) n - total number of nodes in the tree
// Did this code successfully run on Leetcode : Not available
// Any problem you faced while coding this : Idea of using queue didnt occur 


// Your code here along with comments explaining your approach
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
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		if(temp==null) // if the root was null, then we have to make a level 1 tree
			{
				temp=new Node(key); // making a level 1 tree by creating a new node
				root=temp; // assign temp to root since temp changes to a new node now and we pass root in main (root is null)
			}

		while(q.peek()!=null) // check if top element of the queue is null // equal to q.isEmpty in this case
		{
			
			temp=q.poll(); // remove the top element and store in queue
			if(temp.left==null)
			{
				temp.left=new Node(key); // if temp.left is null then the first available place is found to insert the new key
				break;
			}
			else
				q.add(temp.left); // if temp.left is not null, add it to the queue to check for its children
			if(temp.right==null)
			{
				temp.right=new Node(key); // if temp.right is null then the first available place is found to insert the new key
				break;
			}
			else
				q.add(temp.right);
			
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