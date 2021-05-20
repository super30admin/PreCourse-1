// Time Complexity : O(n) for pop() and O(1) for push
// Space Complexity : O(n)
public class StackAsLinkedList {
  
    StackNode current=null;
    StackNode root=null;
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data=data;
            this.next=null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    {
       return current==null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    {
       StackNode node= new StackNode(data);
       if(isEmpty())
       {
           current=node;
           root=current;
       }
       else
       {
           current.next=node;
           current=current.next;
       }

        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    {
        int val=0;
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return val;
        }
        if(current==root)
        {
            val =current.data;
            root=null;
            current=null;
            return val ;
        }
        StackNode node=root;
        while(node.next!=current)
        {
          node=node.next;
        }
        val=current.data;
        current=node;
        return val;

	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    {
        if(!isEmpty())
            return current.data;
        System.out.println("Peek : Stack Underflow");
        return 0;
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
