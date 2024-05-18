public class StackAsLinkedList { 
  
    StackNode root; 
    int count =0;
  
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode() {
            
        }
        StackNode(int data) 
        { 
            //Constructor here 
        } 
        
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode();
        newNode.data = data;
        newNode.next = root;
        root = newNode;
        count++;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	int value;
	if(root == null) {
	    return 0;
	} else {
	    value = root.data;
	    root = root.next;
	    count--;
	}
	return value;
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
        sll.push(40);
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        System.out.println("Size of the stack is : " +sll.count);
    } 
} 
