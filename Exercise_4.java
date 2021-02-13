import java.util.LinkedList;
import java.util.Queue;

// Time Complexity : O(n); n = #nodes
// Space Complexity :O(n); n = #nodes
// Did this code successfully run on Leetcode : Not found on leetcode
// Any problem you faced while coding this : No

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

        //if tree is empty
        if (temp == null) {
            Node node = new Node(key);
            root = node;
            return;
        }

        // Do level order traversal until we find
        // an empty place and add the node.
        Queue<Node> q = new LinkedList<>();
        q.offer(temp);

        while (!q.isEmpty()) {
            Node t = q.poll();

            if (t.left != null && t.right != null) {
                q.offer(t.left);
                q.offer(t.right);
            }
            else if (t.left == null && t.right != null) {
                t.left = new Node(key);
                break;
            }
            else if (t.right == null && t.left != null) {
                t.right = new Node(key);
                break;
            }
            else {
                t.left = new Node(key);
                break;
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