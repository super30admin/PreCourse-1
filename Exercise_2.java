class Node
{
    int data;  
    Node next;      
}
  
class StackNode 
{ 
        private Node top;
        private int count;
  
        StackNode() 
        { 
            this.top=null;
            this.count=0;
        } 
    
	
    public boolean isEmpty() 
    { 
        return top==null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int x) 
    { 
        Node node = new Node();
        if (node == null)
        {
            System.out.println("Stack Overflow");
            return;
        }
        //Write code to push data to the stack. 
        node.data = x;
        node.next = top;
        top = node;
        this.count += 1;
    } 
  
    public int pop() 
    {
        
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int top = peek();
        this.count -= 1;
        this.top = (this.top).next;
        //Also return the popped element 
        return top;
    } 
  
    public int peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("The stack is empty");
            return 0;
        }
        return top.data;
    }
}
public class Main
{
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackNode sll = new StackNode(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
