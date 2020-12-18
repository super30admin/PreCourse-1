//The implementation of stack using LinkedList in this algorithm is based on adding and deleting nodes from the front of the 
//singly linkedlist i.e. all the operations will be done on the head of the singly linkedlist. 

class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Initializates node data
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Returns true if the root node is null i.e. linkedlist is empty
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Time Complexity: O(1)

        //Creates a new node with the required data using the StackNode class
        StackNode newNode = new StackNode(data);
        //The next pointer of the new node will point to the head of the linkedlist as its prepending the linkedlist
        newNode.next = root;
        //The new node becomes the head of the linkedlist 
        root = newNode;
    } 
  
    public int pop() 
    { 	
        //Time Complexity: O(1) as we do not need to do any traversals
        
        //Checks if stack is empty i.e. there are no nodes in the linkedlist
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Else stores the head node which needs to be popped in a temporary node, updates the root node with the next node
        //in the linkedlist and returns the popped value
        StackNode poppedNode = root;
        root = root.next;
        return poppedNode.data;
    } 
  
    public int peek() 
    { 
        //Time Complexity: O(1)

        //Returns the value of the root node as this node is the top node of the stack
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 

       // sll.pop();
       // sll.pop();
       // System.out.println(sll.pop());
    } 
} 
