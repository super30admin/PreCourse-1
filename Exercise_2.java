/**
 * Time Complexity: O(1) for all operations (push, pop, peek, isEmpty) as we only manipulate the head pointer.
 * Space Complexity: O(N) where N is the number of elements in the stack.
 */
public class StackAsLinkedList { 
  
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
   
	
    public boolean isEmpty() 
    { 
       return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(root==null){
            root = newNode;
        }else{
            newNode.next = root;
            root = newNode;
        } 
    } 
  
    public int pop() 
    { 	
	   //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	   //Also return the popped element 
      if(root==null){
           System.out.print("Stack Underflow");
          return 0;
      }
      int poppedValue = root.data;
      root = root.next;  
      return poppedValue;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root!=null)
          return root.data;
        else
          return -1;
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
