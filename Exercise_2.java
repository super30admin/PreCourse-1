// Time Complexity : O(1)
// Space Complexity :O(n), n= number of elements
// Did this code successfully run on Leetcode : No, couldn't find problem on leetcode
// Any problem you faced while coding this : No

public class StackAsLinkedList { 
  
    StackNode root; //here root acts a top
  
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
        StackNode newNode = new StackNode(data);
        newNode.next = root; // link new node to top
        root = newNode; // update new node as top
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int poppedElement = root.data;
        root = root.next;  // update top to next node
        return poppedElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            return 0;
        }

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
