// Time Complexity for push/pop/peek/isEmpty - O(1)
// Space Complexity - O(n) where n is the number of elements in the stack
// For pushing an element onto the stack: reference to the root element is switched to the newly created `StackNode`. The newly created `StackNode`'s `next` pointer is made to refer to the older root.
// For pop: reference to the current root is switched to the next `StackNode`.
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(root == null) {
            root = new StackNode(data);
        } else {
            StackNode newRoot = new StackNode(data);
            newRoot.next = root;
            root = newRoot;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else{
            int res = root.data;
            root = root.next;
            return res;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()) return root.data;
        return 0;
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
