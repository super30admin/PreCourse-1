public class StackAsLinkedList { 
      
    static StackNode root = null; 
    //static StackNode top = null;
    int size;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data=data;
            this.next = null;
            
        } 
    } 
        
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(size == 0)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if(root == null) {
            root = newNode;
        }else {
            StackNode oldRoot = root;
            root = newNode;
            root.next = oldRoot;
        }
        size++;
    } 
  
    public int pop() 
    {   
    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int val = root.data;
            root = root.next;
            size--;
            return val;
        }
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
            return root.data;
        else {
            System.out.println("Stack is Empty");
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