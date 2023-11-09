// Time Complexity : O(1)
// Space Complexity : O(n)

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data; // assigning the value to the class variable
            next = null; // assigning null to the next pointer
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root==null; // root is null if stack is empty
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data); // creating the new node with the value
        // newNode.data = data; // assigning the new node with the value
        newNode.next = root; // assigning the new node's next pointer with the current root

        root = newNode; // making the new node the root
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()){                   // verify if the stack is empty and return 0 if true
            System.out.println("Stack Underflow");
            return 0;
        } 

        int top = root.data;        // store the top of the stack to return it
        root = root.next;           // make the node in the next pointer the new root

        return top;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){  // if stack is empty, return -1
            return -1;
        }
        return root.data;  // else return the top element in the stack
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
