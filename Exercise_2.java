 class StackAsLinkedList {

     // Time Complexity :
     //1. push(): O(1) as insertion into a linked list at the head takes O(1)
     //2. pop(): O(1) as deleting from a linked list's head takes O(1)
     //3. top(): O(1) as accessingt the head of a linked list takes O(1)
     // Space Complexity : O(n) where n is the number of elements in the stack
     // Did this code successfully run on Leetcode : N/A
     // Any problem you faced while coding this :
     // Your code here along with comments explaining your approach:
     //1. made one assumption that the top() method returns 0 when the stack is empty
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
        {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    {
        StackNode newNode = new StackNode(data);

        newNode.next = this.root;
        this.root = newNode;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack is empty!");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int top = this.root.data;
        this.root = this.root.next;

	    //Also return the popped element
        return top;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            System.out.println("Stack is empty!");
            return 0;
        }

        return this.root.data;
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
