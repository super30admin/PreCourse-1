public class StackAsLinkedList { 
  
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
        //If stack is empty return true else return false.
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        /*
            - Assign new StackNode to root.
            - Keep address of oldNode in root.next
         */
        StackNode oldHead = root;
        root = new StackNode(data);
        root.next = oldHead;
        System.out.println("Pushed element" + root.data);
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
	//Also return the popped element
        if (root == null) {
            System.out.println("stack underflow");
            return 0;
         }
        int topValue = root.data;
        root = root.next; //pointing the head to next Node.
        return topValue;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        } else {
            System.out.println("Stack is empty.");
            return -1;
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
