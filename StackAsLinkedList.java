// Time Complexity : O(1) for push, isEmpty, and peek and O(n) for pop
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes - implement stack using queues
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode top;

    StackAsLinkedList()
    {
        this.root = null;
        this.top = null;
    }
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if(null == root)
        {
            root = newNode;
            top = newNode;
        }
        else
        {
            top.next = newNode;
            top = newNode;
        }
        
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        int topElement = top.data;
        StackNode curr = root;
        while(curr.next != top)
        {
            curr = curr.next;
        }
        top = curr;
        top.next = null;

        return topElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
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
