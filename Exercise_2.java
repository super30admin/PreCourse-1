// TC of all push, pop isEmpty and peek methods is O(1)
// SC will be number of elements we want to insert in stack O(1) will be needing constant space
public class StackAsLinkedList { 
  
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
        //Write your code here for the condition if stack is empty. 
		if (root == null)
			return true;
			
		return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
		StackNode sn = new StackNode(data);
		sn.next = root;
		root = sn;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
		int poppedElement;
		if (root == null)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		poppedElement = root.data;
		root = root.next;
		return poppedElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
		int poppedElement;
		if (root == null)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		poppedElement = root.data;
		return poppedElement;
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
