// Time Complexity : O(n) where n is size of list
// Space Complexity : O(n) where n is size of list
// Did this code successfully run on Leetcode : Did not find it in leetcode
// Any problem you faced while coding this :
// File name was not same as class name but class was made public. This resulted in error.


// Your code here along with comments explaining your approach
// if root is null then new node is root;
// Do level order traversal until we find an empty place and add the node.



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
    //static Node temp = root;
      
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
        if(temp == null) {
            temp = new Node(key);
            return;
        }
        System.out.print(temp.key+" ");
        // Do level order traversal until we find 
        // an empty place and add the node.
        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if(node.left == null){
                node.left = new Node(key);
                return;
            }
            if(node.right == null){
                node.right = new Node(key);
                return;
            }
            queue.add(node.left);
            queue.add(node.right);
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