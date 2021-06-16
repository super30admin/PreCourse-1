// Time Complexity : O(1) for all operations
// Space Complexity : O(n) -> n is the number of stackNodes
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No
class StackAsLinkedList {
  
    StackNode root; 
    static class StackNode {
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode tempNode = new StackNode(data);
        if(root == null) {
            root = tempNode;
        } else {
            tempNode.next = root;
            root = tempNode;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	   //Also return the popped element
        if(root == null) {
            System.out.print("Stack Underflow");
            return 0;
        } else {
            int topElement = root.data;
            root = root.next;
            return topElement;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            return 0;
        } else {
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
