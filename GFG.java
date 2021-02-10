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

        // Do a BFS to see where the node fits
        if(temp == null) {
            root = new Node(key);
            return;
        }

        Queue<Node> treeQ= new LinkedList<>();
        treeQ.add(temp);
        while (!treeQ.isEmpty()){
            int count = treeQ.size();
            for(int i=0;i<count;i++){
                Node currentNode = treeQ.remove();
                if(currentNode.left == null) {
                    currentNode.left = new Node(key);
                    return;
                }
                else{
                    treeQ.add(currentNode.left);
                    }

                if(currentNode.right == null){
                    currentNode.right = new Node(key);
                    return;
                }
                else
                    treeQ.add(currentNode.right);

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