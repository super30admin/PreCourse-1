// TC for All Operations: O(1)
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return null == root;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode n = new StackNode(data);
        if(null == root)
        {
            root = n;
        }  
        else 
        {
            n.next = root;
            root = n;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
        int elem = 0;
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
        }
        else 
        {
            elem = root.data;
            StackNode nxt = root.next;
            root.next = null;
            root = nxt;
        }
        return elem;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        int elem = 0;
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
        }
        else 
        {
            elem = root.data;
        }
        return elem;
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
