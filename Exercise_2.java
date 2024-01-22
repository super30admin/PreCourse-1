public class StackAsLinkedList { 
  
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
        return root==null;//Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode(data);
        
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.next = root;
        root = temp;//Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        if(isEmpty()){
            System.out.println("\nStack UnderFlow!");
            return 0;
        }//If Stack Empty Return 0 and print "Stack Underflow"
    	int pop1 = root.data;
    	return pop1;//Write code to pop the topmost element of stack.
	                //Also return the popped element 
    } 
  
    public int peek() 
    { 
    	if (!isEmpty()) {
            return root.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }//Write code to just return the topmost element without removing it.
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
