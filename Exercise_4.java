import java.util.LinkedList; 
import java.util.Queue; 
public class GFG { 
       
    /* A binary tree node has key, pointer to  
    left child and a pointer to right child */
    /* 
        Space complexity: O(N) Worst case scenario: Length of queue would 
            be same as number of elements in given tree(N).
            For node object/given key node to be created it is constant O(1).
            So overall worst case space complexity is O(N).
        Time complexity: O(N) N is total number of nodes.
    */
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
        
        if(temp==null){
            System.out.println("\nRoot is null, creating new.");
            root = new Node(key);
            return;
        }
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        // Do level order traversal until we find 
        // an empty place and add the node. 
            System.out.println("\nRoot is not null.");
            // while(queue!=null){
            while(!queue.isEmpty()){
                temp = queue.peek();
                System.out.println("Node: "+temp.key);
                queue.remove();
                if(temp.left==null) {
                    temp.left = new Node(key);
                    System.out.println("Inserting "+key+" to left of "+temp.key);
                    return;
                } else{
                    queue.add(temp.left);
                }
                //Handling right node
                if(temp.right==null) {
                    temp.right = new Node(key);
                    System.out.println("Inserting "+key+" to left of "+temp.key);
                    return;
                } else{
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