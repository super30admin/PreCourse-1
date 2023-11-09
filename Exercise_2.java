public class StackAsLinkedList { 
  
    StackNode root; 
  
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
        if(top == null){
            return true;
        } else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        System.out.println("inside push operation");
		StackNode temp = new StackNode(data);
		temp.data = data;
		temp.next = top;
		top = temp;
		System.out.println("Element pushed to stack " + top.data);
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    System.out.println("inside pop operation");
		if (top == null) {
			System.out.println("Stack Underflow\"");
			return 0;
		} else {
			int d = top.data;
			top = top.next;
			return d;
		}
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        System.out.println("inside peek operation");
		if (top == null) {
			System.out.println("Stack Underflow\"");
			return 0;
		} else {
			int d = top.data;
			return d;
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
