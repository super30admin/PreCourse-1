// Time Complexity : O(1) (since push,pop and peek take constant time)
// Space Complexity : O(n) (size of the stack)
// Did this code successfully run on Leetcode : No. Ran it on my local machine.
// Any problem you faced while coding this : No 


public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 

  
        StackNode(int data) 
        { 
            //Constructor here 
             this.data = data;
             this.next = null;

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
        //create new node temp
        StackNode temp = new StackNode(data);       
        //put root reference into temp link
        temp.next = root;
        //update root refernce
        root = temp;

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if (isEmpty()) {
        System.out.println("Stack underflow");
        return 0;
    }
    else{
    int value = root.data;
    //update the root after removing
    root = root.next;
    return value;
    }
    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
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
