// Time Complexity : O(1) since the number of elements wont change the efficiency of the operations
// Space Complexity : O(n) where n is number of elements added to stack

// Did this code successfully run on Leetcode : ran locally and it worked fine
// Output is as follows:
// 30 popped from stack
// Top element is 20

// Any problem you faced while coding this : 
// - had to review the initial logic/pseudocode with chatgpt before i could code the solution
// - made one small mistake in the first attempt where i mixed up the pointer assignment in push() operation

public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            // set data to param, and next ptr to null 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        // top in LL based stack is root node - stack is empty if root is NULL
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        // 1. create node 
        // 2. set next ptr of new node to current root 
        // 3. set root to new node
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
        return;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()){
        System.err.println("Stack underflow");
        return 0;
    }
        //Write code to pop the topmost element of stack.
        // 1. read root.data and store in var
        // 2. update root to root.next (it will be null if only single element on stack)
        // 3. return the read value
        int val = root.data;
        root = root.next;
        //Also return the popped element 
        return val;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.err.println("Stack underflow");
            return 0;
        }
        // top in LL based stack is the root node
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
