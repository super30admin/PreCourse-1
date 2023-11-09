// Time Complexity : O(1) for all operations
// Space Complexity : O(N)

class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next;
  
        StackNode(int data) 
        { 
            //Constructor here 
           this.data  = data;
           next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null){
            return true;
        }
        return false;

    } 
  
    public void push(int data) 
    { 
        // create new node and set current top to new node.
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow");
            return 0 ;
        }
        int val = root.data;
        StackNode prev = root.next;
        
        root = prev;
        return val;
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(root != null){
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