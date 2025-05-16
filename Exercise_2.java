// Time Complexity : isEmpty(), push(), pop(), peek() all functions will have O(1) time complexity.
// Space Complexity : O(n) where n is the number of elements inserted in the stack.
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No


// Java program to implement a stack using LinkedList
class StackAsLinkedList { 
  
    StackNode root; 
    int count;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;
        } 
    } 
	
    public boolean isEmpty() 
    { 
        return count == 0;
    } 
  
    public void push(int data) 
    { 
        StackNode newTopNode = new StackNode(data);
        newTopNode.next = root;
        root = newTopNode;
        count++;
    } 
  
    public int pop() 
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode topNode = root;
            root = topNode.next;
            topNode.next = null;
            count--;

            return topNode.data;
        }
    } 
  
    public int peek() 
    { 
        if (isEmpty()) {
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
