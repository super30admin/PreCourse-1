import java.io.*; 
public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode last;
    StackNode lastbutone;
  
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
    if(root==null)
    {
        return true;
    }
    else 
    {
        return false;
    }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root==null)
        {
            root= new StackNode(data);
            last=root;
            lastbutone=root;
        }
        else{
            
            last.next= new StackNode(data);
            lastbutone=last;
            last=last.next;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    int value=0;
    StackNode temp=root;
    if(root==null)
    {
        System.out.println("Stack Underflow");
        return value;
    }
    else
    {
        value=last.data;
        last=lastbutone;
        last.next=null;
        while (temp.next!=null)
        {
            lastbutone=temp;
            temp=temp.next;
            last=temp;
        }
    }
    return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return last.data;
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
