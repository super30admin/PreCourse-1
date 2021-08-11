using System;
public class StackAsLinkedList { 
  
    StackNode root; 
  
    public class StackNode { 
        public int data; 
        public StackNode next; 
  
        public StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	public boolean isEmpty() 
    { 
        if(root == null)
         return true;
        else return false;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode();
        if(root == null){
            root = newNode;
        }
        else{
          StackNode temp = root;
          root = newNode;
          newNode.next = temp;
        }
    } 
  
    public int pop() 
    { 	
     int poppedVal = int.MinValue;
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(root == null){
        return 0;
        Console.WriteLine("Stack Underflow");
    }
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
    else{
       poppedVal = root.data;
       root = root.next;
     }
     return poppedVal;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null)
        return int.MinValue;
        else{
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        Console.WriteLine(sll.pop() + " popped from stack"); 
  
        Console.WriteLine("Top element is " + sll.peek()); 
    } 
} 
