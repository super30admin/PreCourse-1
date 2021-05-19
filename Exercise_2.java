class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null) {
            System.out.println("Empty StacK!!");
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        if (root == null) {
            root = node;
        } else {
            StackNode s = root; // store the current root 
            root = node; // replace root to point to new node
            root.next = s; // point the next of the root to the previous node
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if (root == null) {
        System.out.println("Stack Underflow");
        return 0;
    }
    //Write code to pop the topmost element of stack.
    int pop = root.data; // the element which is removed
    root = root.next; // point the root to the next node
    
    return pop;
    } 
  
    public int peek() 
    { 
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to just return the topmost element without removing it.
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
    } 
} 
