//TimeCOmplexity -> 0(1)
//Space Complexity -> O(1)
public class Exercise_2 { 
  
    
    StackNode root = null; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int d) 
        { 
            //Constructor here 
            data = d;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        node.next = null;
        if(root == null) {
            root = node;
        }else {
           node.next = root;
           root = node;
        }
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(root == null) {
        System.out.println("Stack Underflow");
        return 0;
    }
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
    int element = root.data;
    root = root.next;
    return element;
   
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;
    } 

  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
       
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
