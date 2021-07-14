public class StackAsLinkedList { 
  
    StackNode root; 
    int size = 0;
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = next;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return (root == null);
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 

            StackNode node = new StackNode(data);
            node.next = root;
            root = node;

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
    int data = root.data;
    root = root.next;
    return data;
    } 
  
    public int peek() 
    { 
        return root.data;
        //Write code to just return the topmost element without removing it.
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
