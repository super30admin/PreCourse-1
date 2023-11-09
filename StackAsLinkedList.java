// Time Complexity : 
//                    isEmpty: O(1)
//                    Push:    O(1)
//                    Pop:     O(1)
//                    Peek:    O(1)
//                    Creation:O(1)
// Space Complexity : 
//                    isEmpty: O(1)
//                    Push:    O(1)
//                    Pop:     O(1)
//                    Peek:    O(1) 
//                    Creation:O(1)
// Did this code successfully run on Leetcode : Not applicable
// Any problem you faced while coding this : No

//Approach: If we want to push an element I am inserting that element at the beginning of the linked list so that it will be easy to pop. 
// If we push the element at the end of the linkedlist. We will face problem while we try to pop an element as it is a single linked list and we don't have the address of previous node.

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
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return true;
        }
        else    
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode sn = new StackNode(data);
        sn.next = root;
        root =sn;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty())
            return 0;
        else {
            int value = root.data;   
            root = root.next;
            return value;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            return 0;
        }
        else 
            return root.data;
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
