class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data = data;
           this.next = null;//Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if (this.root == null)
            return true;
        return false;//Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode newnode = new StackNode(data);
        newnode.next = root;
        root = newnode;//Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //If Stack Empty Return 0 and print "Stack Underflow"
        int topnode = root.data;
        root = root.next;
        return topnode;
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        return root.data;//Write code to just return the topmost element without removing it.
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