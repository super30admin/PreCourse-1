class StackAsLinkedList {

    StackNode root = null;

    static class StackNode {
        int data; 
        StackNode next;

        StackNode(int data) 
        { 
            //Constructor here
            //head of the link list
            this.data = data;
            this.next = null;
        }
    }

   // StackNode root = null;
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return this.root == null;

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(isEmpty()) {
            this.root = newNode;
        } else {
            newNode.next = root;
            this.root = newNode;
        }
        System.out.println(data + " Pushed into the stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        //Write code to pop the topmost element of stack.
        int data = root.data;
        this.root = root.next;
        return data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
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
