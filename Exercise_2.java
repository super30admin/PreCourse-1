// Time Complexity : O(1)
// Space Complexity : O(N) - N number of nodes inserted
// Did this code successfully run on Leetcode : Yes
/*
Any problem you faced while coding this :
Since class 'StackAsLinkedList' was declared public, IntelliJ wanted the file name to be the same as the class name.
Hence made the class not public. The other option was to rename the file from 'Exercise_2.java' to 'StackAsLinkedList.java'
*/
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
        // Added new node to the front of the LinkedList to make pop operation easier
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;

    } 
  
    public int pop() 
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int val = root.data;
        root = root.next;
        return val;
    } 

    public int peek() 
    {
        if (isEmpty()) {
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
