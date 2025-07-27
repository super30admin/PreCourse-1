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
    StackAsLinkedList(){
	 int top=-1;
    }
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if the stack is empty. 
	return root==null;
	
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
	StackNode curr = new StackNode(data);
	    if(top==-1){
		root = curr;
		top++;
		return;
	    }
	    StackNode temp;
	    temp = root;    // root --> temp ---> ....Adding new node in the front
	    root = curr;
	    root.next = temp;
	    top++;
    }
	
		
	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
	if(top == -1){
		system.out.println("Stack Underflow");
		return 0;
	}
        //Write code to pop the topmost element of the stack.
	StackNode temp = root;
	root = root.next;
	top==;
	//Also return the popped element
	return temp.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null) return 0;
	return root.data;
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
