public class StackAsLinkedList { 
  
    StackNode root;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int d) 
        { 
            //Constructor here
            data = d; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if (root==null) return true;
        return false; 
    } 
  
    public void push(int data) 
    { 
        StackNode nw = new StackNode(data);
        //Write code to push data to the stack.
        if(root == null){
            root = nw;            
        }
        else {
            nw.next = root;
            root = nw;
        } 
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int res = root.data;
        root = root.next;
	//Also return the popped element 
    return res;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
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
