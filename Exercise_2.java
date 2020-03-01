public class StackAsLinkedList { 
  
    StackNode root; 
    private StackNode top;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next= null;
        } 
    } 
    
	public StackAsLinkedList(){
        root = new StackNode(-1);
        top = root;
    }
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return top == root;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        top.next = new StackNode(data);
        top = top.next;
    } 
  
    public int pop() 
    {
        if(isEmpty())
            return 0;
        StackNode temp = root;
        while(temp.next!=top)
        {
            temp = temp.next;
        }
        int val = top.data;
        temp.next = null;
        top = temp;
        return val;	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(isEmpty())
        {
            System.out.println("Empty Stack");
            return -1;
        }
            
        return top.data;
        //Write code to just return the topmost element without removing it.
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
