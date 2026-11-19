// Time Complexity :
 //   isEmpty() : O(1)
 //   push(data) : O(1)
 //   pop() : O(1)
 //   peek() : O(1)

// Space Complexity :
 //   isEmpty() : O(1)
 //   push(data) : O(1)
 //   pop() : O(1)
 //   peek() : O(1)

// Did this code successfully run on Leetcode : Not available
// Any problem you faced while coding this : It was unclear what to return if peek() is called when stack is empty.


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
        if(root == null){
            return true;
        } 
        return false;
    } 
  
    public void push(int data) 
    { 
        if(root == null){
            root = new StackNode(data);
            return;
        }
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
        return;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    if(root == null){
        System.out.println("Stack Underflow");
        return 0;
    }
    if(root.next == null){
        int data = root.data;
        root = null;
        return data;
    }
    StackNode temp = root;
    root = root.next;
    temp.next = null;
    return temp.data;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack Underflow");
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
