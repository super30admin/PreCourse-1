public class StackAsLinkedList { 
  
    StackNode root; 
    public StackAsLinkedList()
    {
        this.root=null;
    }
 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
		this.data=data;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data); 
  
       
  
        // initialize data into temp data field 
        //temp.data = x; 
  
        // put top reference into temp link 
        temp.next =root; 
  
        // update top reference 
        root = temp; 

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (root == null) { 
            System.out.print("\nStack Underflow"); 
            return 0; 
        } 
  
        // update the top pointer to point to the next node
        int val=root.data;
        root = (root).next; 
        return val;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) { 
            return root.data; 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return -1; 
        } 

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
