import java.util.LinkedList; 
import java.util.Queue; 

// Time Complexity : O(n) 
// Space Complexity :  O(n), n-> no of elements in tree
// Any problem you faced while coding this : could not think of using queues for level order traversal


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
        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp); //add top root first, to enter loop

        while (!q.isEmpty()) {
            temp = q.peek(); 
            q.remove(); // dequeue 
 
            if (temp.left == null) {
                temp.left = new Node(key); // if child not present add node and break
                break;
            }
            else
                q.add(temp.left); // enqueue if child present
 
            if (temp.right == null) {
                temp.right = new Node(key); // if child not present add node and break
                break;
            }
            else
                q.add(temp.right); // enqueue if child present
        }

        // Do level order traversal until we find 
        // an empty place and add the node.  
        
      /*  if(temp.key<key)
        {
            if(temp.right!=null)
            {
                insert(temp.right,key);
            }
            else{
                temp.right= new Node(key);
                return;
            }
            
        }
        else if(temp.key>key){

             if(temp.left!=null)
            {
                insert(temp.left,key);
            }
            else{
                temp.left= new Node(key);
                return;
            }
        } // code to insert in a bst*/
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