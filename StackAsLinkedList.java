// Time Complexity:
// Push operation: O(1) 
// Pop operation: O(1)
// Peek operation: O(1)
// isEmpty operation: O(1)

// Space Complexity: The space complexity is directly proportional to the stack size.
// In the provided code, it is O(size).

public class StackAsLinkedList { 
  
    StackNode root; 
    int size =0;
    public StackAsLinkedList() {
        this.root = null;
    }
  
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
        //Write your code here for the condition if stack is empty. 
         if(size == 0)
            return true;
        else
            return false;     
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newnode = new StackNode(data);
        if(root == null)
        {
            root = newnode;
        }
        else
        {
            newnode.next = root;
            root = newnode;
        }
        size++;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(size == 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
             int poppedele = root.data;
             root = root.next;
             size = size-1;
             return poppedele;   
        }
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
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
