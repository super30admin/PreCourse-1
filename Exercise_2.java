public class StackAsLinkedList{

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
        // if stack is empty.
       if(root == null){
         return true;
       }
       return false; 
    } 
  
    public void push(int data) 
    { 
         StackNode stackNode = new StackNode(data);
         if(root == null){
            root = stackNode;
         }
         else 
            root = stackNode.next;
                   
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
      if(isEmpty()) {
         System.out.println("Stack Underflow. Stack is Empty");
         return 0;
      }
      else {
         int topElement = root.data; //Also return the popped element 
         root = root.next;           //Write code to pop the topmost element of stack. 
         return topElement;
      }
    } 
  
    public int peek() 
    { 
        if(!isEmpty()) {
          return root.data;         //code to just return the topmost element without removing it.
        } 
        else {
          System.out.println("Stack Underflow. Stack is Empty");
          return 0;
        }
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
