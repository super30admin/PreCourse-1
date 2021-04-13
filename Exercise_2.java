 class StackAsLinkedList {
  
    StackNode root = null;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            this.next = null;
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
        StackNode tmp = new StackNode(data);
        if(this.root == null){
            this.root = tmp;
            return;
        }

        tmp.next = this.root;
        this.root = tmp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
	//Also return the popped element
        if(this.root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int res = this.root.data;
        this.root = this.root.next;
        return res;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return this.root.data;
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
