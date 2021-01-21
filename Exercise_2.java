class StackAsLinkedList { 
  
    StackNode top; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(top == null) {
            return true;
        } else {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if (top == null) {
            top = new StackNode(data);
        } else {
            StackNode temp = new StackNode(data);
            temp.next = top;
            top = temp;
        }
    } 
  
    public int pop() 
    { 	
    //If Stack Empty Return 0 and print "Stack Underflow"
    if(top == null) {
        System.out.println("Stack Underflow");
        return 0;
    } else {
        StackNode poppedEle = top;
        top = top.next;
        return poppedEle.data;
    }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return top.data;
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
