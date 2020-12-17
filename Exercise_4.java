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
        Queue<Node> queue = new LinkedList();
        Node nodeToBeInserted = new Node(key);
        queue.add(temp);
        while (!queue.isEmpty())
        {
            Node cur = queue.remove();
            if (cur.left == null) {
                cur.left = nodeToBeInserted;
                return;
            }
            else {
                queue.add(cur.left);
            }
            if (cur.left == null) {
               cur.left = nodeToBeInserted;
            }
            else {
              queue.add(cur.left);
            }
            if (cur.right == null) {
                cur.right = nodeToBeInserted;
                return;
            }
            else {
                queue.add(cur.right);
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

// Time Complexity : O(N) - N - no.of elemets of binary tree
// Space Complexity : O(N) - size of queue
// Did this code successfully run on Leetcode : I executed it on IntelliJ IDE and it ran fine
// Any problem you faced while coding this : Not really. My approach is very simple and naive. I could not think of any other logic. P
                                            // Please let me know of a better solution


// Your code here along with comments explaining your approach : self explanatory