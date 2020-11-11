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
        if(temp == null){
            root = new Node(key);
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        //adding the temp element in the queue
        queue.add(temp);
        // Do level order traversal until we find 
        // an empty place and add the node.  
        while(!queue.isEmpty()){

            //frontmost element in the queue is removed and we search for its left and right nodes
            temp = queue.peek();
            //we remove the front element
            queue.remove();
            if(temp.left == null){//If there is no left element present we add or current node 
                temp.left = new Node(key);
                break;
            }else{
                queue.add(temp.left); // If left node is present we add it to our queue for level order
            }
            if(temp.right == null){//If there is no right element present we add or current node 
                temp.right = new Node(key);
            }else{
                queue.add(temp.right);// If right node is present we add it to our queue for level order
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