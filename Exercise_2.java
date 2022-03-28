// Time Complexity : push operation: O(1) , every time we push we perform same operation
//                   pop operation: O(1)
//                   peek operation: O(1)
// Space Complexity : O(n)
// Linkedlist implementation of stack is better because we create new node for each we don't run into transfer data into newer array scenario
// Did this code successfully run on Leetcode : Yes
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
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        else
            return false; 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        }
        else {
            newNode.next = root;
            root = newNode;
        }
        System.out.println(data + " pushed to stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 

        int popped;
        if (root == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            popped = root.data;
            root = root.next;
            return popped;
        }
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return root.data;
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
