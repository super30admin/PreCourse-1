// push(int data): O(1) 
// pop(): O(1)
// peek(): O(1) 
// Overall space complexity is O(n)
class StackAsLinkedList { 
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
        return root == null; // If root is null, stack is empty
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.  
        StackNode newNode = new StackNode(data); // Create a new node with the given data
        if (root == null) { // If the stack is empty
            root = newNode; // Set the new node as root
        } else { // If stack is not empty
            StackNode temp = root; // Store the current root
            root = newNode; // Set the new node as root
            newNode.next = temp; // Link the new node to the previous root
        }

    } 
  
    public int pop() 
    { 	
        if (isEmpty()) { // If stack is empty
            System.out.println("Stack Underflow"); // Print Stack Underflow
            return 0; // Return 0
        }
        int popped = root.data; // Store the data of the root node to be popped
        root = root.next; // Move root pointer to the next node
        return popped;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data; // Return data of the root node
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
