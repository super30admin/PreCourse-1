import java.util.LinkedList; 
import java.util.Queue; 

class GFG { 
       
    /* A binary tree node has key, pointer to  
    left child and a pointer to right child */
    static class Node { 
        int key; 
        Node left, right; 
          
        // constructor 
        Node(int key)
        { 
            this.key = key; 
            left = null; 
            right = null; 
        } 
    } 

    static class QueueList {
        QueueNode queueHead;

        static  class QueueNode 
        {
            Node queueNodeData;
            QueueNode queueNodeNext;

            QueueNode (Node data) {
                this.queueNodeData = data;
                this.queueNodeNext = null;
            }
    	}

    	public boolean isEmpty() {
            if(queueHead == null) 
            {
                return true;
            } 

            else 
            {
                return false;
            }
        }

        public void push (Node data) {
            
            //Write code to push data to the stack.
            QueueNode node = new QueueNode(data);
            if (! isEmpty()) 
            {
                QueueNode nextNode = this.queueHead;

                while (nextNode.queueNodeNext != null) 
                {
                    nextNode = nextNode.queueNodeNext;
                }
                nextNode.queueNodeNext = node;
            } 
            else 
            {
                System.out.println("Stack is empty, adding at the beginning");
                this.queueHead = node;
            }
        }

        public Node pop() 
        {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return null;
            } 

            else 
            {
                QueueNode nextNode = this.queueHead;
                while (nextNode.queueNodeNext != null) {
                    nextNode = nextNode.queueNodeNext;
                }
                Node value = nextNode.queueNodeData;
                nextNode = null;
                return value;
            }
        }

        public Node peekQueue() 
        {
            //Write code to just return the topmost element without removing it.
            if (isEmpty()) 
            {
                System.out.println("Stack Underflow");
                return null;
            } 

            else 
            {
                QueueNode nextNode = this.queueHead;
                while (nextNode.queueNodeNext != null) {
                    nextNode = nextNode.queueNodeNext;
                }
                return nextNode.queueNodeData;
            }
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
        QueueList queueList = new QueueList();

        if (temp == null) {
            root = new Node(key);
            return;
        }

        queueList.push(temp);
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