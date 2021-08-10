/*Running Time Complexity: O(1)
Space Complexity: O(1);
*/
public class Main { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        //Write your code here for the condition if stack is empty. 
        if(root == null) return true;//if root at first position then empty
        return false;
    }
    public void push(int data){
        StackNode node = new StackNode(data);
        //Write code to push data to the stack. 
        if(isEmpty()){
            root = node;
        }
        else{
        StackNode temp = root;
        root = node;
        node.next = temp;
        }
    } 
  
    public int pop() 
    { 	
     int element=0;   
	//If Stack Empty Return 0 and print "Stack Underflow"
	if(isEmpty()){
	    System.out.println("Stack Underflow");
	    return 0;
	}
	else{
	    
	    element = root.data;
	    root = root.next;
	    return element;
	    
	}
	
        //Write code to pop the topmost element of stack.
        
	
	//Also return the popped element 
	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return root.data;    
        }
        
        
    } 
  
	//Driver code
    public static void main(String[] args){ 
  
        Main sll = new Main(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
    } 
} 