/* Implementation of stack as a linked list */
/* Insertion and Deletion Complexity : O(1) */
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data=data;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null) return true;
        else
            return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        if(root==null){
            root=new StackNode(data);
        }
        else{
            StackNode n=new StackNode(data);
            n.next=root;
            root=n;
        }
        
    } 
  
    public int pop() 
    { 	
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            StackNode n=root;
            root=root.next;
            int x=n.data;
            return x;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }
        return -1;
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