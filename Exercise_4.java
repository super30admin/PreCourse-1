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

        // Do level order traversal until we find 
        // an empty place and add the node.
        if(temp ==  null){
            Node newnode = new Node(key);
            root = newnode;
            temp = newnode;
            return;
        }
        Queue<Node> treequeue = new LinkedList<>();
        treequeue.add(temp);
        while(!treequeue.isEmpty()){
                Node n = treequeue.poll();
                if(n.left!=null){
                    treequeue.add(n.left);
                }
                else{
                    Node newnode = new Node(key);
                    n.left = newnode;
                    return;
                }
                if(n.right!=null){
                    treequeue.add(n.right);
                }
                else{
                    Node newnode = new Node(key);
                    n.right = newnode;
                    return;
                }

        }


        //Approach to insert elements using recursion
//        if(temp ==  null){
//            Node newnode = new Node(key);
//            root = newnode;
//            temp = newnode;
//            return;
//        }
//        if(temp.left ==  null){
//            Node newnode = new Node(key);
//            temp.left = newnode;
//            return;
//        }
//        if(temp.right ==  null){
//            Node newnode = new Node(key);
//            temp.right = newnode;
//            return;
//        }
//        insert(temp.left,key);
//        insert(temp.right,key);
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