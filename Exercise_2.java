// Implement Stack using Linked List.

/* Time Complexity : 

O(1) -> For each method push, pop, peek. Since it is happeing on the top of the stack

*/

/* Space Complexity : 

O(N) where N is constant and equal to 1000. So can we call it O(1) ?

*/ 

// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(this.root == null)
            return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(isEmpty())
            this.root = new StackNode(data);
        else{
            StackNode newNode = new StackNode(data);
            StackNode temp = this.root;
            this.root = newNode;
            this.root.next = temp;
        }
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        StackNode temp = this.root;
        this.root = root.next;
        return temp.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        return this.root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        sll.peek();
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
