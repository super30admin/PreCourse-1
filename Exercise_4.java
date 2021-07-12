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
    // TC: O(N), where N = size of tree
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); 
        System.out.print(temp.key+" "); 
        inorder(temp.right); 
    } 
       
    /*function to insert element in binary tree */
    // TC: O(N), where N = size of tree
    static void insert(Node temp, int key) 
    { 
        Node n = new Node(key);

        if(null == temp)
        {
            root = temp = n;
        }
        else 
        {
            Queue<Node> q = new LinkedList<>();
            q.add(temp);

            while(!q.isEmpty())
            {
                Node node = q.poll();
                if(null == node.left)
                {
                    node.left = n;
                    return;
                }
                else 
                {
                    q.add(node.left);
                }

                if(null == node.right)
                {
                    node.right = n;
                    return;
                }
                else 
                {
                    q.add(node.right);
                }
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
       
        System.out.print( "Inorder traversal before insertion: "); 
        inorder(root); 
       
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion: "); 
        inorder(root); 
        System.out.println("");
    } 
}

/**
 * 
 Before:
            10
        11           9
    7           15      8
 
After:
            10
        11           9
    7      [12]  15      8
 
 * 
 */