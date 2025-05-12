// Time Complexity: 
// - isEmpty(): O(1)
// - push() : O(1)
// - pop(): O(1)
// - peek(): O(1)
// Space Complexity: O(n) where n = MAX (1000)
// Any problem you faced while coding this : No

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
       if(root == null) {
           return true;
       }
       return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode s = new StackNode(data);
        if(root == null) {
            root = s;
        } else {
            s.next = root;
            root = s;
        }
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
	if(root == null) {
	    System.out.print("Stack Underflow");
	    return 0;
	} else {
	    int x = root.data;
	    root = root.next;
	    return x;
	}
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null) return 0;
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
