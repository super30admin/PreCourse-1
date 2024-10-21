//Complexity time O(1) Space O(n)
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        
  
        StackNode(int data) 
        { 
            //Constructor here
            this .data=data;
            next=null;
            
        } 
    } 
    
	
    public boolean isEmpty() 
    {    if(root==null){
        System.out.println("Stack is empty");
        return true;
    }
    else{
        System.out.println("Stack is not empty");
        return false;
    }
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    {   StackNode newNode=new StackNode(data);
        if(root==null){
            root=newNode;
        }
        newNode.next=root;
        root=newNode;
        
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        if(root==null){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=root.data;
            root=root.next;
            return x;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    {   return root.data;
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
