import java.util.LinkedList; 
import java.util.Queue; 
public class GFG { 
       static boolean inserted = false;

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
    	if(temp == null)
    		temp = new Node(key);
    	
    	Queue<Node> q = new LinkedList<>();
    	q.add(temp);

    	while(!q.isEmpty()){
    		Node temporary = q.poll();
    		if(temporary.left!=null){
    		q.add(temporary.left);	
    		}else{
    		temporary.left = new Node(key);
    		break;
    		}
    		
    		if(temporary.right != null){
    			q.add(temporary.right);
    		}
    		else {
    		temporary.right =new Node(key);
    		break;
    		}
    		
	
    	}
    	
   
    	
    	
    }  
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
         key = 22; 
        insert(root, key);
         key = 32; 
        insert(root, key);
         key = 42; 
        insert(root, key);
         key = 52; 
        insert(root, key);
         key = 62; 
        insert(root, key);
         key = 72; 
        insert(root, key);
         key = 82; 
        insert(root, key);
         key = 92; 
        insert(root, key);
         key = 102; 
        insert(root, key);
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root); 
    } 
}
