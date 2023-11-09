class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);  
        if(root==null){
            root=newNode;
        }
        else{
            StackNode tmp = root;
            root = newNode;
            newNode.next = tmp;
        }
        System.out.println(data + " element pushed to stack"); 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        int popped = Integer.MIN_VALUE;
        if(root==null){
            System.out.println("Stack Underflow"); 
            return 0;
        }
        else{
            popped = root.data;
            root = root.next;
        }
        return popped;
    } 
  
    public int peek() 
    { 
        int peeked = Integer.MIN_VALUE;
        if(root==null){
            System.out.println("Stack Underflow"); 
        }
        else{
            peeked = root.data;
        }
        return peeked;
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
