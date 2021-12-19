// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach

//Implementing stack using linked list
public class Exercise_2{ 
  
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
        return root ==  null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        if(!isEmpty()){
            node.next=root;

        }
        root = node;
    } 
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(!isEmpty()){
            System.out.println("Stack Underflow");
        }
        //Write code to pop the topmost element of stack.
        int data = root.data;
        root = root.next;
	//Also return the popped element 
    return data;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        }
        return -1;
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
