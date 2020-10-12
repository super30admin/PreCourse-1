import java.util.PriorityQueue;
import java.util.Queue;

class GFG {
    static class MyQueue {
        QueueNode head;
        static class QueueNode { 
            GFG.Node data; 
            QueueNode next; 
      
            QueueNode(GFG.Node data) 
            { 
                //Constructor here 
                this.data = data;
                this.next = null;
            } 
        } 

        MyQueue(GFG.Node n) {
            this.head = new QueueNode(n);
        }

        boolean isEmpty() {
            return this.head == null;
        }

        void add(GFG.Node n) {
            QueueNode temp = this.head;
            if (temp == null) {
                this.head = new QueueNode(n);
                return;
            }
            while(temp.next!= null) {
                temp = temp.next;
            }
            temp.next = new QueueNode(n);
        }

        GFG.Node remove() {
            if (this.head == null)
                return null;
            QueueNode temp = this.head;
            this.head = this.head.next;
            return temp.data;
        }
    }
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
        if (temp == null) {
            temp = new Node(key);
            return;
        }
        
        MyQueue q = new MyQueue(temp);

        while(!q.isEmpty()) {
            Node curr = q.remove();
            if (curr.left == null) {
                curr.left = new Node(key);
                return;
            } else {
                q.add(curr.left);
            }
            if (curr.right == null) {
                curr.right = new Node(key);
                return;
            } else {
                q.add(curr.right);
            }
        }

        // Do level order traversal until we find 
        // an empty place and add the node.  
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