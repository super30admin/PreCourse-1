// Time Complexity : To perform insertion in binary tree, we have to traverse through all the nodes until we reach node referencing to left or right null and then add, O(n)
// Space Complexity : space increases as per number of elements added, it is O(n).
// Did this code successfully run on Leetcode : NA, this was not a leetcode question.
// Any problem you faced while coding this : I was initially under impression that temp is the new Node which we have to add, which was wrong an we needed to create a new Node with value Key, on getting that point i was able to write the code.

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
    // To insert we need to traverse the binary tree in a breadth first manner there by reaching all left and right child of node before further levels
    static void insert(Node temp, int key) 
    { 
        // if there is no initial node, root is assigned new value
        if(temp==null) {
            root = new Node(key);
            return;
        } else {
            // Otherwise queue is an approach to take for breadth first where we can add a node and loop until queue gets empty
            Queue<Node> que = new LinkedList<>();
            que.offer(temp);
            // Do level order traversal until we find 
            // an empty place and add the node.  
            while(!que.isEmpty()){
                // Take out node in queue and check its left and right child
                Node item = que.poll();
                // Left child takes precedence, if it is absent we can assign new value to left child else add the left child to queue
                if(item.left!=null) {
                    que.offer(item.left);
                } else {
                    item.left = new Node(key);
                    return;
                }
                // if left child is added to queue check if right child is present, if not insert new node to right else, add right child to queue
                if(item.right!=null) {
                    que.offer(item.right);
                } else {
                    item.right = new Node(key);
                    return;
                }
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