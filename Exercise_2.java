public class Exercise_2 {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.

        return root == null;
    } 
  
    public void push(int data) 
    {

        if(root == null) {
            root = new StackNode(data);
            return;
        }
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null) return 0;

        int val = root.data;
        root = root.next;
        return val;
    } 
  
    public int peek() 
    { 
        if(root == null) return 0;
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    {

        Exercise_2 sll = new Exercise_2();
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
