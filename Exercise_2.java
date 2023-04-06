// Time Complexity : O(1)
// Space Complexity : O(N)

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
        return this.root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode t = root;
        this.root = new StackNode(data);
        this.root.next = t;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int d = this.root.data;
        this.root = this.root.next;
        return d;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            return 0;
        }
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
