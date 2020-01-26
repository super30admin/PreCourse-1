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
            this.left = null; 
            this.right = null; 
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
        //Making node to add new key 
        Node add = new Node(key) ; 

        //when the tree root is empty 
        if (temp == null) {
            temp = add ; 
        }

        //traversing to find the appropriate position to the add new key (add Node)
        while (temp.left != null || temp.right != null) {
            //when the new key is greater, we traverse down the right side of the tree. Similarly, when new key is smaller than the root key, we traverse down the left subtree
            if (temp.key > key) {
                temp = temp.left ; 
            } else if (temp.key < key)
            temp = temp.right ; 
        }

        //here we have reached the lead node, so we check if the add node has to be the right child or the left child  
        if (temp.key > key) 
            temp.left = add ; 
        else
            temp.right = add ;
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