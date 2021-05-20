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
        
        if(root == null)
        {
            root = new Node(key);
            
        }
        else
        { 
            //Creating a queue to perform level order traversal
            
            Queue<Node> queue = new LinkedList<Node>();
             queue.add(temp);
 
        // Checking whether left or right child is empty and then insert node
        // Time complexity O(n) - since we are traversing the queue 
         // Space complexity O(n) - creating a seperate queue
        while (!queue.isEmpty()) {
            temp = queue.peek();
            queue.remove();

         // Checking whether left node is null. If yes then insert the node there
            if (temp.left == null) {

                temp.left = new Node(key);
                break;
            }
            else
                queue.add(temp.left);
        // Checking whether right node is null. If yes then insert the node there
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                queue.add(temp.right);
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