// Time Complexity : Constant for push, pop, peek
// Space Complexity : Constant for push, pop, peek
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : No

class StackAsLinkedList {
  
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
        // returns true is root is null else returns false;
        return root == null;
    } 
  
    public void push(int data) 
    {
        // insert new element into the stack.
        StackNode current = new StackNode(data);
        current.next = root;
        root = current;
    }

    public int pop()
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        // return 0 if root is null else remove top element from stack;
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        int temp = root.data;
        root = root.next;
        return temp;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        // return 0 if root is null else return root value;
        if(isEmpty())
            return 0;

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
