class StackAsLinkedList {
  
    StackNode root;
    int size;
  
    static class StackNode {
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    }

    public StackAsLinkedList()
    {
        this.size = 0;
        root = null;
    }
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return size == 0;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        if (root == null) {
            root = temp;
        } else {
            temp.next = root;
            root = temp;
        }
        size++;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if (root == null)
            return 0;

        StackNode n = root;
        root = root.next;
        size--;

        return n.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null)
            return 0;

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
