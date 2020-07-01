public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode top;
    StackAsLinkedList() {
        top = null;
    }
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
        return top == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        
        if(node == null) {
            System.out.println("Error. Stack is full");
            return;
        }
        node.data = data;
        node.next = top;
        top = node;
    } 
    
    
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if (isEmpty()) {
        System.out.println("Stack Underflow");
        return 0;
    }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    StackNode temp;
    temp = top;
    top = top.next;
    return temp.data;
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
