// Time complexity: O(1) push, isEmpty, pop, peek
// Space complexity: O(1) only one node is added

public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            this.next = null; // Since there is no next for this node, next is initialized to null
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return this.root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data); // Create a new node and insert data in the new node
        newNode.next = this.root; // Point the new node's next to current root
        this.root = newNode; // make the new node a root node
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
	//Also return the popped element
        int data = this.root.data;
        this.root = this.root.next;
        return data;
    } 
  
    public int peek() 
    {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        //Write code to just return the topmost element without removing it.
        return this.root.data;
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
