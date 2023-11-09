// Did this code successfully run on Leetcode : Yes

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

    StackAsLinkedList() {
        this.root = null;
    }
    
	// Time Complexity : O(1)
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
    
    // Time Complexity : O(1)
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
    // Time Complexity : O(1)
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(this.isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int popNodeData = root.data;
            root = root.next;
            return popNodeData;
        }
    } 
    // Time Complexity : O(1)
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.isEmpty()) {
            System.out.println("Stack is Empty!!");
            return 0;
        } else {
            return root.data;
        }
    }
    
}

class Main {
  
    //Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from linked list stack"); 
        System.out.println(sll.pop() + " Popped from linked list stack"); 
        System.out.println(sll.pop() + " Popped from linked list stack"); 
        System.out.println("Top element of linked list stack is " + sll.peek()); 
        System.out.println(sll.isEmpty() + " :Is linked list Stack empty or not?"); 
    } 
} 
