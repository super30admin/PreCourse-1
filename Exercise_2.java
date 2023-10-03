// Time complexity : Constant for push, pop, peek
// Space complexity : Constant for push, pop, peek
class StackAsLinkedList { 
  
    static StackNode root; 
  
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
        return (root==null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newRoot = new StackNode(data);
        newRoot.next = root;
        root = newRoot;
        
        System.out.println("Pushed to stack :" + root.data);


    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    if(isEmpty()){
        System.out.println("Stack Underflow");
        return -1;
    }
    else{
        int newData = root.data;
        root = root.next;
        return newData;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        return 0;
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
