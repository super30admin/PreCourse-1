import java.util.LinkedList; 
import java.util.Queue;

//import org.graalvm.compiler.graph.Node;

//import org.graalvm.compiler.nodes.extended.GetClassNode; 
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
    
    static Node getVacantNode(Node root)
    {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {   
            Node curr = queue.removeFirst();
            if(curr.left==null || curr.right==null)
            {
                return curr;
            }
            queue.add(curr.left);
            queue.add(curr.right);
        }
        return null;
    }
    /*function to insert element in binary tree */
    static void insert(Node temp, int key)
    {
        // Do level order traversal until we find 
        // an empty place and add the node.
        Node newNodeAdded=new Node(12);
        if(temp==null){
            temp = newNodeAdded;
        }
        Node locationNode = getVacantNode(root);
        if(locationNode.left==null){
            locationNode.left = newNodeAdded;
            return;
        }
        locationNode.right = newNodeAdded;
          
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