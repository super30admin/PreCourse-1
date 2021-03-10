 class StackAsLinkedList {
  
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
        return (root == null);
    } 
  
    public void push(int data)
    {
        StackNode currNode = new StackNode(data);
        if(isEmpty()){
            root = currNode;
        }
        //Write code to push data to the stack.
        else{
            currNode.next = root;
            root =currNode;
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
            StackNode currNode = root;
            root = root.next;
            currNode.next = null;
            return currNode.data;
        }


    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return -1;
        }
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
