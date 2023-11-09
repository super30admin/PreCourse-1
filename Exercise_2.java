public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            int data;
            StackNode next;

            StackNode(int data) { this.data = data; }
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        int data;
        StackNode next;

        StackNode(int data) { this.data = data; }
    } 
  
    public void push(int data) 
    {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
    }
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        int popped =0;
        if (root == null) {
            System.out.println("Stack is Stack Underfllow");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            return 0;
        }
        else {
            return root.data;
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
