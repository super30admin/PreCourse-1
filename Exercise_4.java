// Time Complexity : O(n)
// Space Complexity : O(2n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Using queue for Binary Tree 



import java.util.LinkedList; 
import java.util.Queue; 
public class GFG { 
       
    /* A binary tree node has key, pointer to  
    left child and a pointer to right child */
    static class Node { 
        int key; 
        Node left, right; 
          
        // constructor 
        // Initialize class attributes
        Node(int key){ 
            this.key = key; 
            left = null; 
            right = null; 
        } 
    } 
    static Node root; 
    static Node temp = root; 
      
    /* Inorder traversal of a binary tree*/
    // inorder : left child is visited first, then parent, then right child
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
        // Initialize queue to access tree nodes.
         Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp); // add root to queue
        
        while(!queue.isEmpty()) {
            temp = queue.peek(); // temp is initialized with the front element of queue
            queue.remove(); // remove front element
            
            if(temp.left == null) { // check if temp (front element), has left child
                temp.left = new Node(key); // if no left child, insert key here
                break;
            }
            else 
            {
                queue.add(temp.left); // else add this node to queue
            }
            
            if(temp.right == null) { // check if temp (front element), has right child
                temp.right = new Node(key); // if no right child, insert key here
                break;
            }
            else
            {
                queue.add(temp.right); // else add this node to queue
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