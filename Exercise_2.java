// Exercise_2 : Implement Stack using Linked List.

// Time Complexity : O(1) as push, pull & peek happens instantly as we have root on top all the time
// Space Complexity : O(N) as we need a Single Linked List to store / implement the stack
// Did this code successfully run on Leetcode : Could not find it on leetcode. But ran successfully locally
// Any problem you faced while coding this : Got stuck on defining the constructor. But once that was rest everything followed well.

class Exercise_2 { 
  
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
        if(root == null)
            return true;
        return false;

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root==null){
            root = new StackNode(data);
        }
        StackNode newNode = new StackNode(data);
        StackNode temp = root;
        root = newNode;
        root.next = temp;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write code to pop the topmost element of stack.
        int top = root.data;
        root = root.next;

	    //Also return the popped element 
        return top;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null) {
            System.out.println("Stack Underflow!");
            return 0;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
