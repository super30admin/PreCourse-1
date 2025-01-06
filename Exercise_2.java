class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return (root == null);

    } 
  
    public void push(int data) 
    { 
        StackNode new_node = new StackNode(data);
        //Write code to push data to the stack. 
        if(root==null){
            root=new_node;
        }
        else{
            new_node.next=root;//new element is inserted in the top of the stack
            root=new_node;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        int popped = root.data; // getting the popped value
        root=root.next;
        return popped;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        return root.data; // return the top data
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
