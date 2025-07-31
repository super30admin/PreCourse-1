// Time Complexity: O(1) for push, pop, and peek operations
// Space Complexity: O(1) for storing the stack elements in linked list nodes
class StackAsLinkedList { 
  
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
    
    StackNode dummy = new StackNode(-1); // Dummy node to simplify operations
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return dummy.next == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode curr = new StackNode(data);
        curr.next = dummy.next;
        dummy.next = curr;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(dummy.next == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        StackNode temp = dummy.next;
        dummy.next = dummy.next.next;
        temp.next = null;
	//Also return the popped element
        return temp.data; 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return dummy.next.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        System.out.println("Top element is " + sll.peek()); 
        sll.push(30); 
        System.out.println(sll.peek() + " peek from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        sll.push(50); 
        System.out.println("Top element is " + sll.peek()); 
        sll.push(80); 
        System.out.println("Top element is " + sll.peek()); 
        sll.push(90); 

        System.out.println("Top element is " + sll.peek()); 
    } 
} 
