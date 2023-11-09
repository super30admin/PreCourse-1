public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data=data;
           this.next=null;
           //Constructor here

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root==null) return true;
        return false;
    } 
  
    public void push(int data) 
    {
        StackNode s = new StackNode(data);
        s.next=root;
        root=s;
        //Write code to push data to the stack.
    } 
  
    public int pop() 
    {
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int x = root.data;
        root = root.next;
        return x;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
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
