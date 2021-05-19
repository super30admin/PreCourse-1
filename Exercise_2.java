public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            root.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        // Checking if the root node is null or not
        if(root == null)
        {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack 

        // Create a new node and point the new node to the root of the stack. Time Complexity O(1)
        StackNode oldroot = root;
        root = new StackNode();
        root.data = data;
        root.next = oldroot;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    // Removing the topmost element by assigning the root to the next element and returning the data of the popped element
    //Time Complexity  O(n)
	
	     if(root == null)
	     {
	         System.out.print("Stack Underflow");
	         return 0;
	     }
	     else
	     {
	         int popdata = root.data;
	         root = root.next;
	         return popdata;
	     }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
