public class StackAsLinkedList { 
  
    StackNode root; 

    public StackAsLinkedList()
    {
        root = null;
    }
  
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
        return root == null;
    } 
  
    public void push(int data) 
    {  StackNode node = new StackNode(data);
        //Write code to push data to the stack. 
        if (root == null)
        {
            root = node;
        }
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if ( isEmpty())
    {
        System.out.println("Stack Overflow");
        return 0;
    }
    else
    {
        int data;
       data = root.data;

        root = root.next;

        return data;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.

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