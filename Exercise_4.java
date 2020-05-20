import java.util.LinkedList; 
import java.util.Queue; 
//import java.util.AbstractQueue;
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
        Node n = new Node(key);
        Queue q = new LinkedList(); //Using the queue for keepig the track of left and right nodes, so that we can traverse in a level wise
        Node dummy = null;   //Using this dummy to mark that current level has reached end.
        q.add(temp);
        q.add(dummy);
        while(q != null){   //queue contains all the viisted nodes in a level wise, so untill queue is not null, we will find a spot where we can insert.
            Node x = (Node)q.poll();
            if(x != dummy){   
                if(x.left == null){  
                    x.left = n;     
                    break;           
                }
                else{
                    q.add(x.left);
                }
                if(x.right == null){
                    x.right = n;  
                    break;              
                }
                else{
                    q.add(x.right);
                }
            }
            else{
                q.add(dummy);   
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




// Time Complexity : O(no. of nodes in the tree) for insert
// Space Complexity : O(1) for insert
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : Nothing