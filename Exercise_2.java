// Time Complexity : Need to refresh all the understanding for this.
// Space Complexity : Need to refresh all the understanding for this.
// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : No problem but trouble in understanding time and space complexity.
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
        // If the root node is not even initialised return true or else false.
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        //Create an object of StackNode.
        StackNode stackNode = new StackNode(data);
        //check if the current root is not empty then point the next node for newly created stack node to the root.
        if(!isEmpty()) {
            stackNode.next = root;
        }
        //This will take care if the root is empty as well as to move the current root pointer to newly created stack node.
        root = stackNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            //fetch the data from the root element as it will be always the top node.
            int poppedElement = root.data;
            //point the root to root.next as the root node will be removed with the pop operation.
            root = root.next;
            return poppedElement;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) return -1;
        else return root.data;
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
