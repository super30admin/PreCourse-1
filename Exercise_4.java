/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
    	Node newNode=new Node(key);
        Queue<Node>q=new LinkedList();
        q.add(temp);
        while(!q.isEmpty())
        {
        	Node node=q.remove();
        	if(node.left==null)
        	{
        		node.left=newNode;
        		return;
        	}
        	else if(node.right==null)
        	{
        		node.right=newNode;
        		return;
        	}
        	else{
        		q.add(node.left);
        		q.add(node.right);
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