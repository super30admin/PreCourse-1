class StackAsLinkedList { 
  
    StackNode root;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            
        } 
    } 
    
    public StackAsLinkedList(){
        this.root = null;
    }
	

    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(this.root == null){
            System.out.println("Stack is Empty");
            return true;
        } 
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next = this.root;
        this.root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(!isEmpty())
    {
        StackNode temp = root;
        this.root = this.root.next;
        return temp.data;
    }
    else{
        System.out.println("Stack underflow");
        return -1;
    }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
        {
            return this.root.data;
        }
        else{
            System.out.println("Stack underflow");
            return -1;
        }
    } 
  
	
    
} 

class Exercise_2{

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
