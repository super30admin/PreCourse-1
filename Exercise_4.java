// Time Complexity :    O(n)
// Space Complexity :   O(n)
// Did this code successfully run on Leetcode : Not found on leetcode
// Any problem you faced while coding this : No


import java.util.LinkedList; 
import java.util.Queue; 
public class Exercise_4 { 
       
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
        Queue<Node> queue=new LinkedList<>();
        if(temp==null){
            Node newnode = new Node(key);
            temp=newnode;
            return;
        }
        queue.add(temp);
        while(!queue.isEmpty()){              

            Node curr =queue.peek();         
            queue.remove(curr);
            if(curr.left==null){           

                Node newNode = new Node(key);
                curr.left=newNode;
                return;
            }
            queue.add(curr.left);        

            if(curr.right==null) {     

                Node newNode = new Node(key);
                curr.right = newNode;
                return;
            }
            queue.add(curr.right);      
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