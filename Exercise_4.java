/* Exercise_4 : Insert an element in a Binary Tree.
*/

// Time Complexity : O(n) as it has to traverse to the end of the linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//we have to iterative level order traversal using queue.
//case 1) if we find a node whose left child is empty, make new key as left child of node
//case 2) else find a node whose right child is empty, make new key as right child of node
//keep traversing tree until we find

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
        //initialising queue using linked list
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find an empty place and add the node. 
        //keep traversing until queue is not empty
        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();

            if(temp.left == null){
                temp.left = new Node(key);
                break;
            }
            else
                q.add(temp.left);
            if(temp.right == null){
                temp.right = new Node(key);
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