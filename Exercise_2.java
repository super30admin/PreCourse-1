class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { this.data = data;   //Constructor here 
            this.next = null;
           
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;  //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { StackNode newNode = new StackNode(data); //Write code to push data to the stack.
        if (root == null) { 
            root = newNode; 
        } else { 
            StackNode temp = root; 
            root = newNode; 
            newNode.next = temp; 
        } 
        System.out.println(data + " pushed to stack");    
    } 
  
    public int pop() 
    { 	
	if (root == null) {  //If Stack Empty Return 0 and print "Stack Underflow"
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
        int popped = root.data; 
            root = root.next;  //Write code to pop the topmost element of stack.
	return popped;  //Also return the popped element 
        } 
    } 
  
    public int peek() 
    { 
       if (root == null) { 
            System.out.println("Stack is empty"); 
            return 0; 
        } else { 
            return root.data; 
        }  
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
