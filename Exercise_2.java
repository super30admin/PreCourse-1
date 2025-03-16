// Time Complexity : 
// - push() → O(1) → Inserting at the top is constant time.
// - pop() → O(1) → Removing the top element is constant time.
// - peek() → O(1) → Viewing the top element is constant time.

// Space Complexity : 
// - O(n) → In the worst case, we may have `n` elements in the stack.

// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : 
// - Initially forgot to update the `root` after popping the top element.
// - Fixed it by pointing `root` to the next element after popping.

public class Exercise_2 { 
  
    StackNode root; 
  
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
        System.out.println(data + " pushed to stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int popped = root.data;
        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()){
            System.out.println("Stack Underflow");
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
