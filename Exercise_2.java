 class StackAsLinkedList { 
  
    StackNode root; // root is the top of stack here?
  
    static class StackNode { 
        int data; 
        StackNode next; // the next should be of type "StackNode" too
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null; // create new atomic node for any new data whenever a contructor is called
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(this.root == null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data); // whenever a new data is to be pushed, first create a temp new node with the dgiven data
        
        if(root == null){
            root = newNode;
            return;
        } 
        // insert every element such that the new node contains the address of the old node ( add the element from the head side, and for the pop() remove from the head side too)
        newNode.next = root;
        root = newNode;

        

        
    } 
  
    public int pop() 
    { 	
    //If Stack Empty Return 0 and print "Stack Underflow"
    if(root == null){
        System.out.println("Stack Underflow");
        return 0;

    }
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    int topElement = root.data;
    root = root.next;
        return topElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Empty Stack");
            return 0;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        sll.push(50);
        System.out.println(sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
