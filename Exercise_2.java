//Space Complexity : O(n) Time complexity : O(1).

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
        } 
    } 
    
    
    public boolean isEmpty() 
    { 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root==null)
        root=new StackNode(data);
        else
         {StackNode s= new StackNode(data);
          s.next=root;
          root=s;
              
         }
    } 
  
    public int pop() 
    {   
    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    
    if(root==null)
    {
        System.out.println("Underflow");
        return 0;
    }
    int retval= root.data;
    root=root.next;
    return retval;
    } 
  
    public int peek() 
    { 
        if(root==null)
        {System.out.println("Underflow");
            return 0;
        }
        else
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