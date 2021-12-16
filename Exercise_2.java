// Time Complexity : Insert Operation, Pop operation and Peek - all three require us to traverse the linked list atleast once  - hence O(N).
// Space Complexity : Depends on the list of elements, if N elements are stored, O(N).
// Did this code successfully run on Leetcode : Not Applicable
// Any problem you faced while coding this : 1) Made a mistake in order of updating the current and previous node pointers, 
//the prev must be updated to store the current value, before the we do curr = curr.next.

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
        if(root == null) return true;
        else return false;

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        
        if(root == null)
        {
            root = node;
        }
        else
        {
            StackNode curr = root;
            while(curr.next!= null)
            {
                curr = curr.next;
            }
            curr.next = node;

        }
    } 
  
    public int pop() 
    {
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) 
        {
            System.out.println("Stack Underflow.");
            return 0;
        }
        else
        {
            StackNode curr = root;
            StackNode prev = null;
            while(curr.next!= null)
            {
                
                prev= curr;
                curr= curr.next;
                System.out.println("The value of curr is: "+ curr.data + " and prev is: "+ prev.data);
            }
            
            if (prev!= null) prev.next = null;
            else {
                //we are deleting the root node
                root = null; 
            }

            return curr.data;
        }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    {
        if(isEmpty()) return 0;
        StackNode curr = root;
        while(curr.next!= null)
        {
            curr= curr.next;
        }
        return curr.data; 
       
        //Write code to just return the topmost element without removing it.
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        sll.push(40); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
