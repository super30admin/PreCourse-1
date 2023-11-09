//Time complexity : O(1) for all the push, pop, peek, isEmpty operations
//Space Complxity : O(n) all the time, where n is the number of elements added to stack

public class StackAsLinkedList { 
    
    //Create a StackNode root which points the element last added to the Stack
    StackNode root;
  
    static class StackNode { 
        int data; 
        StackNode next;
        StackNode(int data) 
        { 
          this.data = data;
          this.next = null;
        } 
    } 
    StackAsLinkedList(){
        this.root = null;    
    }
    
    public boolean isEmpty() 
    {  //if the root == null, no elements were added to stack or all of them are removed, thus stack will be empty
        if(root == null) return true; 
        else return false;
    } 
  
    public void push(int data) 
    { 
        //create a temp node with given data, and next of the element should point to previous elements i.e. root, and then point the root to the element added
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;    
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        
        //check if stack is empty
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else {
         // return root's value and mark previous  element as new root  
            int val = root.data;
            root = root.next;
            return val;
        }
    } 
  
    public int peek() 
    { 
        //check if the stack is empty
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        // return data held by root
        else return root.data;
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
