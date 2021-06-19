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
        Node addN = new Node(key);
        if(temp==null)
        {
            temp = addN;
            return;
        }

        Queue<Node> store = new LinkedList<Node>();
        store.add(temp);

        while(store.isEmpty()==false)
        {
            Node check = store.remove();
            if(check.left==null)
            {
                check.left = addN;
                return;
            }
            else{
                store.add(check.left);
            }
            if(check.right == null)
            {
                check.right = addN;
                return;
            }
            else{
                store.add(check.right);
            }
        }

        // Do level order traversal until we find 
        // an empty place and add the node.  
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
