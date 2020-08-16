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
    	// FIrst we create a linkedlist to add the node elements
    	LinkedList<Node> ll = new LinkedList<Node>(); 
        ll.add(temp);
        //We find an empty space to push a node element let say we find an empty at left then also check right is empty then we add to linkedlist
        while (!ll.isEmpty()) { 
            temp = ll.peek(); 
            ll.remove(); 
       
            if (temp.left == null && temp.right == null) { 
                temp.left = new Node(key); 
                break; 
            } 
            else
                ll.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node(key); 
                break; 
            } 
            else
                ll.add(temp.right); 
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