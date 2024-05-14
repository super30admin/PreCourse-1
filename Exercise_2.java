/**
 *
 * Time Complexity:
 * O(1) --> isEmpty(), push(), pop(), peek()
 *
 * Space Complexity:
 * O(1) --> isEmpty(), push(), pop(), peek()
 *
 */

public class StackAsLinkedList { 
  
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
//        If root Node is null then the stack is empty
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
//        Add new Node to the front and make the new node head
        StackNode newNode = new StackNode(data);
        newNode.next = this.root;
        this.root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
//        return head value and make head.next as head
        int topVal  = root.data;
        root = root.next;
        return topVal;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
//        return head.data if stack is not empty else return 0
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
