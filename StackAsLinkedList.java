// Time Complexity: For push/Pop/peek/isEmpty operations , TC is O(1) as only a seek at position is required.
//Space Complexity: O (N) as maximum of N elements can be stored in a list.
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
    } 

    public StackAsLinkedList(){
        root=null;
    }
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return (root==null);

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode=new StackNode();
        newNode.data=data;
        newNode.next=root;
        root=newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root!=null)
        {   
            int value=root.data;
            StackNode nextNode=root.next;
            root=nextNode;
            return value;
        }
        return 0;
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root!=null)
        {
            return root.data;
        }
        return 0;
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
