// Time Complexity: O(1) for push, pop, and peek operations
// Space Complexity: O(n) where n is the number of elements in the stack
public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //If root is null then stack is empty
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        //If stack is empty, set root to newNode
        if (root == null) {
            root = newNode;
        } else {
            //If stack is not empty, set newNode's next to current root and update root
            newNode.next = root;
            root = newNode;
        }
    } 
  
    public int pop() 
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0; // Return 0 if stack is empty
        }

        //Store the topmost element in a variable
        int poppedValue = root.data;

        //Update root to the next element
        root = root.next;

        //Return the popped element
        return poppedValue;
    } 
  
    public int peek() 
    { 
       if(isEmpty()) {
           System.out.println("Stack Underflow");
       }

       return root.data; // Get the top element
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
