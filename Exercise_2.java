class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root == null)
            root = new StackNode(data);
        else{
            StackNode nextNode = root;
            StackNode newNode = new StackNode(data);
            while(nextNode.next!=null){
                nextNode = nextNode.next;
            }
            nextNode.next = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
     if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
    StackNode popedNode = root;
    StackNode preNode = root;

    if(root.next == null){
        root = null;
    }else{
        while(popedNode.next!=null){
            preNode = popedNode;
            popedNode = popedNode.next;
        }
        preNode.next = null;
    }
    return popedNode.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode popedNode = root;
         while(popedNode.next!=null){
        popedNode = popedNode.next;
    }
    return popedNode.data;
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
        sll.push(40);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
    } 
} 
