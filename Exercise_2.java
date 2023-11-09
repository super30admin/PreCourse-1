// Time Complexity : push, pop, peek, empyt O(1)
// Space Complexity : O(N) and extra  memory for pointers
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : a bit confusion with pointers especially while push operations

public class Exercise_2 {
  
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
        StackNode node = new StackNode(data);
        if(root == null) {
            root = node;
        } else {
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
        System.out.println(data + " pushed to stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        int popValue = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack UNderflow");
        }
        else {
            popValue = root.data;
            root = root.next;
        }
        return popValue;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack UNderflow");
            return Integer.MIN_VALUE;
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
