// Time Complexity : O(1)
// Space Complexity : O(n)
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
		return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
		StackNode newNode = new StackNode(data); 
		if(root == null){
			root = newNode;
		} else {
			StackNode store = root;
			root = newNode;
			root.next = store;
		}
    } 
  
    public int pop() 
    { 	
		//Case 0: If Stack Empty Return 0 and print "Stack Underflow"
		if(root == null){
			System.out.println("Stack Underflow");
			return 0;
		} 
		//Case 1: when there is the last element in the stack
		else if(root.next == null){
			int store = root.data;
			root = null;
			return store;
		} 
		//Case 2: When more than 1 elements in the stack
		else {
			int store = root.data;
			root = root.next;
			return store;
		}
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
		if(isEmpty()){
			System.out.print("Stack is Empty, nothing to Peek");
			return -1;
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
