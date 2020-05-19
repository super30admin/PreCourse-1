
// Did this code successfully run on Leetcode :  Problem not on Leetcode but working on eclipse
// Any problem you faced while coding this : Unaware of concepts of level order traversal and insertion
// Your code here along with comments explaining your approach

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

        Queue<Node> queue = new LinkedList<>(); // created a queue to traverse the tree
        queue.add(temp); // adding the root temp into the queue

        while(!queue.isEmpty()) // checking if queue is empty i.e the tree has been fully traversed and there are no nodes
        {
            temp = queue.peek(); // storing the front element of queue in temp
            queue.remove(); // removing the front element
            
            if(temp.left!=null) // if there are left children to the element in temp
                queue.add(temp.left); // add left child to queue
            else
            {
                temp.left = new Node(key); // otherwise create a new node of key value and place at temp left child
                break; // break as insertion done
            }

            if(temp.right!=null) // if there are right children to the element in temp
                queue.add(temp.right); // add right child to queue
            else
            {
                temp.right = new Node(key);// otherwise create a new node of key value and place at temp right child
                break; // break as insertion done
            }
            
        }
        // Time Complexity : O(n)
        // Space Complexity : O(n)


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