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

    public StackAsLinkedList()
    {
        this.root = new StackNode(Integer.MIN_VALUE);
    }
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the conditi on if stack is empty. 
        if(root.data == Integer.MIN_VALUE)
        {
            return true;
        }

        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root.data == Integer.MIN_VALUE)
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode temp = root;
        int ele = temp.data;
        root = root.next;
        temp.next = null;
        return ele;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root.data == Integer.MIN_VALUE)
        {
            System.out.println("Stack Underflow");
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
