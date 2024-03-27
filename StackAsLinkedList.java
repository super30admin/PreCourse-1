public class StackAsLinkedList { 
    // Time Complexity : isEmpty - O(1), push - O(1), pop - O(1), peek - O(1)
    // Space Complexity : O(1) as we are using an array of constant length
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
        //the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //push data to the stack.
        StackNode newNode = new StackNode(data); 
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //pop the topmost element of stack.
	//Also return the popped element 
        if(!isEmpty()) {
            StackNode curr = root;
            root = root.next;
            return curr.data;
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    } 
  
    public int peek() 
    { 
        //return the topmost element without removing it.
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