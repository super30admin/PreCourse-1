// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Not Tried
// Any problem you faced while coding this : No

//Steps
//1) insert
     //a) As I have to do level order traversal, I used queue data structure and then added root to the queue.Further, I polled and inserted left and right of the tree until I found an empty node. Once I found the empty node I inserted the new node with the key and exited the queue traversal.     

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

        Queue<Node> q = new LinkedList<>();
        q.offer(temp);
        
        while(!q.isEmpty()){
            Node curr = q.poll();

            if(curr.left!=null){
                q.offer(curr.left);
            }else{
                curr.left = new Node(key);
                return;
            }

            if(curr.right!=null){
                q.offer(curr.right);
            }else{
                curr.right = new Node(key);
                return;
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