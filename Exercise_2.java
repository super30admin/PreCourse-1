// Time Complexity :
    // isEmpty - O(1)
    // push() - O(1)
    // pop() - O(1)
    // peek() - O(1)

// Space Complexity : O(n), n - no. of nodes in linked list

// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this :
// I was stuck while trying to find the logic for O(1),
// as I initially added at the end of linked list instead of front.

 public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int data = root.data;
        root = root.next;
        return data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            return 0;
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
