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
    	Queue<Node> listNodes = new LinkedList<Node>();
    	listNodes.add(temp);
    	
    	while(!listNodes.isEmpty()) {
    		Node head = listNodes.element();
    		listNodes.remove();
    		
    		if(head.left !=null) {
    			listNodes.add(head.left);
    		}else if(head.left ==null){
    			head.left = new Node(key);
    			break;
    		}
    		
    		if(head.right !=null) {
    			listNodes.add(head.right);
    		}else if(head.right ==null){
    			head.right = new Node(key);
    			break;
    		}
    	}
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        root = new Node(10);                                             //  10         
        root.left = new Node(11);									//   11      9
        root.left.left = new Node(7);						//		   7      15  8
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root);                                                //7 11 10 15 9 8
       
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:");      //7 11 12 10 15 9 8
        inorder(root); 
    } 
}