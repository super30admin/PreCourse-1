import org.omg.PortableInterceptor.NON_EXISTENT;

import javafx.scene.Node;

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 

        StackNode top;
        StackNode(int data) 
        { 
            this.data=data;
            
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
         return root == null;
    } 
  
    public void push(int data) 
    { 
        Node temp = new Node();
        return; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
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
