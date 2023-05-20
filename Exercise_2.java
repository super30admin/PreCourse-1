class StackAsLinkedList { 
  
    StackNode root;
    StackNode top = root;

  
    static class StackNode { 
        int data; 
        StackNode next; 
        

        StackNode(int d) 
        { 
            //Constructor here
            data = d;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return top == null; 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        if (isEmpty()) { 
            top = temp;
            root = temp;
        }
        else {
            top.next = temp;
            top = top.next;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int ret = top.data;
        top = root;
        while(top.next!=null) top = top.next;
        return ret;
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) return top.data;
        System.out.println("Stack is empty");
        return 0;
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
