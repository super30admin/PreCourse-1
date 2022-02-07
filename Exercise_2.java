// Time Complexity :
    //Push: O(1)
    //Pop: O(n)
    //peek: O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach :  used root as dummy node and current as pointer to top of stack

class StackAsLinkedList {
  
    StackNode root = new StackNode(0);
    StackNode current;
    StackAsLinkedList() {
        current = root;
    }
  
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
        return current == root;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node =  new StackNode(data);
        current.next = node;
        current = current.next;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (root == current) return 0;
        //Write code to pop the topmost element of stack.
        int result = current.data;
        StackNode prev = root;
        while (!isEmpty() && prev.next != current) prev = prev.next;
        current = prev;
        current.next = null;
	//Also return the popped element
        return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) return current.data;
        return 0;
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
