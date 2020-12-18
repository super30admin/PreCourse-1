import java.util.LinkedList; 
import java.util.Queue; 
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
        //Time Complexity : O(N) where N is the number of nodes in the tree and we need to traverse all the nodes 
        //in the worst case to find a position to insert the new node

        // Do level order traversal until we find 
        // an empty place and add the node.  

        //If there are no nodes in the tree, the root node will be the inserted node
        if(temp == null)
            root = new Node(key);
        
        //Creates a queue to do a level order traversal in order to keep the track for left and righ nodes for every node
        Queue<Node> queue = new LinkedList<>();
        //Adds the first node to the queue
        queue.add(temp);

        //Till the queue is not empty, this functions checks left and right child of a node and adds them to the queue
        //if they exist or inserts the new node at the missing child's place
        while(!queue.isEmpty())
        {
            Node treeNode = queue.poll();
            if(treeNode.left == null)
            {
                treeNode.left = new Node(key);
                break;
            }
            queue.add(treeNode.left);

            if(treeNode.right == null)
            {
                treeNode.right = new Node(key);
                break;
            }
            queue.add(treeNode.right);
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