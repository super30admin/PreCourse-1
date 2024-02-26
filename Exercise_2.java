// Time Complexity :
// Space Complexity :

public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null) {
            return true;
        }
        else {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if (root!= null) {
            StackNode new_node = new StackNode(data);
            new_node.next = root;
            root = new_node;
        }
        else {
            root = new StackNode(data);
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        
        int head = root.data; 
        StackNode node = root.next;
        root.next = null;
        root = node;
        return head;
        //Write code to pop the topmost element of stack.
	        //Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root != null){
            return(root.data);
        }
        else {
            return -1;
        }
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
