package precourse1;

public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
      StackNode(int data) 
        { this.data=data;
            next = null;
            //Constructor here 
        } 
    
    }
	
    public boolean isEmpty() 
    { if(root==null)
    return true;
    else 
    return false;
        
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);

        if(root == null)
            root = node;
        else{
            StackNode temp = root;
            root = node;
            node.next = temp;
        
        }
    }
  
    public int pop() 
    { 	if(root==null){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        else{
            int x = root.data;
            root = root.next;
            return x;
            
            
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    
    { 	if(root==null)
            return 0;
        else{
            return root.data;
        }
    }
        //Write code to just return the topmost element without removing it.
    
  
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