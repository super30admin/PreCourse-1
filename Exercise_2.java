// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Can you send me any good reference material to read and understand space complexity


// Your code here along with comments explaining your approach

public class StackAsLinkedList { 
  
    StackNode root; 
  
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
        if(root == null)
        {
            System.out.println("Stack is underflow");
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);

        if(root == null)
        {
            root = newNode;
        }
        else{
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;            
        }
    } 
  
    public int pop()    
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    int popResult=0;
    if (!isEmpty())
    {
        popResult = root.data;
        root = root.next;
        return popResult;
    }
    return popResult;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
        {
            return root.data;
        }
        else
        {
            isEmpty();
            return 0;
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
