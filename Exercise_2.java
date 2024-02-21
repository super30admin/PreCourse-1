class StackAsLinkedList {

    // Time Complexity : O(1), insertion and retrieval is constant time
    // Space Complexity : O(n), where "n" is number of elements inserted
    // Did this code successfully run on Leetcode : IDK question number
    // Any problem you faced while coding this : No
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) {
            //Constructor here
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if(root == null) {
            return true;
        } else {
            return false;
        }
    } 
  
    public void push(int data) {
        //Write code to push data to the stack.
        if(isEmpty()){
            root = new StackNode(data);
        } else {
            StackNode temp = root;
            root = new StackNode(data);
            root.next = temp;
        }
    } 
  
    public int pop() {
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        //Write code to pop the topmost element of stack.
        StackNode tempRoot = root;
        root = root.next;

	    //Also return the popped element
        return tempRoot.data;
    } 
  
    public int peek() {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return -1;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) {

        // Assumption: number >= 0
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
