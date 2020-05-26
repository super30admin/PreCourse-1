//problem 4: Insert an element in binary tree

//Time Complexity : For 1 element instertion it would take O(log n) as per the height of the tree.
//Space Complexity: Space complexity would also be O(log n) as parent nodes as to be pushed to the queue to insert the new node.
// Any problem you faced while coding this : No

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
        if(temp == null)
            temp = new Node(key);
        else{
            Queue<Node> ele = new LinkedList<Node>();
            ele.add(temp);
            while(temp.left != null && temp.right !=null){
                ele.add(temp.left);
                ele.add(temp.right);
                temp = ele.poll();
            }
            if(temp.left == null)
                temp.left = new Node(key);
            temp.right = new Node(key);
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