// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Finding the complexities. Need to work on it.

// Your code here along with comments explaining your approach

//public class StackAsLinkedList wasn't working. Removed public
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. \
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
        if(root==null)
        {
            root = newNode;
        }
        else{
            StackNode temp = root;
            root = newNode;
            newNode.next=temp;
        }
        System.out.println(data+ "pushed into stack");
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root ==null)
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        int print=root.data;
        root=root.next;
        return print;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null)
        {
            System.out.println("Print Stack is empty");
            return 0;
        }
        else
        {
            return root.data;
        }
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
