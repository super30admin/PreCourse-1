// Time Complexity :
//      inorder() - O(n) - need to traverse the whole ll to insert a new node
//      insert() - O(h+log(n))
//      populateQueue() - O(h) - does level order traversal for h levels
//      
// Space Complexity :
//      overall - O(n) - Use Queue to do level order tarversal
//      insert() - O(1)
//      insert() - O(1)
//      populateQueue() - N/A
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

//Insert a node in a Binary Tree
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
    static java.util.Queue<Node> lvlOdrQueue = new java.util.LinkedList<Node>(); 
      
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
        Node temp1 = temp;

        // Do level order traversal until we find 
        // an empty place and add the node.
        
        populateQueue(temp1);

        while(lvlOdrQueue.size() > 0)
        {
            Node t = lvlOdrQueue.remove();

            if(t.left == null)
            {
                t.left = new Node(key);
                break;
            }
            else if(t.right == null && t.left != null)
            {
                t.right = new Node(key);
                break;
            }
        }
        
    }

    public static void populateQueue(Node temp)
    {
        if(lvlOdrQueue.size() == 0)
        {
            lvlOdrQueue.offer(temp);
            if(temp.left != null)
                lvlOdrQueue.offer(temp.left);
            if(temp.right != null)
                lvlOdrQueue.offer(temp.right);

            
            if(temp.left != null)
                populateQueue(temp.left);
                
            if(temp.right != null)
                populateQueue(temp.right);
        }
        else
        {
            if(temp != null)
            {
                if(temp.left != null)
                lvlOdrQueue.offer(temp.left);

                if(temp.right != null)
                    lvlOdrQueue.offer(temp.right);


                if(temp.left != null)
                    populateQueue(temp.left);
                    
                if(temp.right != null)
                    populateQueue(temp.right);
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