class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            data = data;
            next = null;
        } 
        StackNode() 
        { 
            //Constructor here 
            next = null;
        } 
       
    } 
    StackAsLinkedList(){
        root = null;
    }
	
    public boolean isEmpty() 
    { 
        return root == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        temp.data = data;
        temp.next = root;
        root = temp;


    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        StackNode pop = root;
        root = root.next;
        return pop.data;
    
    } 
  
    public int peek() 
    { 
       
        //Write code to just return the topmost element without removing it.
        if(root!=null){
           return root.data; 
        }
        System.out.println("Stack is Empty");
        return -1;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        sll.push(40); 
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
