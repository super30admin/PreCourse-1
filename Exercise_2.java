class StackAsLinkedList {

    // Time Complexity : O(1) for push, pop, and peek operations
    // Space Complexity : O(n) for the stack linked list, where n is the number of elements in the stack
    // Did this code successfully run on Leetcode : Didn't run on Leetcode

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
        if(root == null)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if (isEmpty()) {
            root = new StackNode(data);
        } else {
            StackNode newNode = new StackNode(data);
            newNode.next = root;
            root = newNode;
        }
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        //Write code to pop the topmost element of stack.
        int poppedElement = root.data;
        root = root.next;

        //Also return the popped element
        return poppedElement;
    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return root.data;
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
