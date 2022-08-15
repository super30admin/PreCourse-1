class StackAsLinkedList {
  
    StackNode top; 

    StackAsLinkedList() {
        top = null;
    }
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int d) 
        { 
            data = d;
            next = null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return top == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int x) 
    { 
        StackNode temp = new StackNode(x);
        temp.data = x;
        temp.next = top;
        top = temp;
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    {
        if (top==null) {
            System.out.print("Stack underflow!");
            return 0;
        }
        int ret = top.data;
        top = top.next;
        return ret;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Empty stack");
            return -1;
        } 
        //Write code to just return the topmost element without removing it.
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
