class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        return root==null;
    } 
  
    public void push(int data) 
    {
        StackNode temp = new StackNode(data);

        if (temp == null) {
            return;
        }

        temp.next = root;
        root = temp;

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        StackNode top = root;
        top.next = root.next;
        root = root.next;
        return top.data;

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
        sll.push(40);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
    } 
} 
