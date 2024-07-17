// Time Complexity : O(1) for push(), pop(), peek(), and isEmpty()
// Space Complexity : O(n) where n is the number of elements in the stack
// Did this code successfully run on Leetcode : Local environment ( IntelliJ)
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach
public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data =data;
            this.next = null;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() 
    { 
        return root == null;
    }

    // Push an element onto the stack
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    }

    // Pop an element from the stack
    public int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int pop = root.data;
        root = root.next;

        return pop;
    }

    // Peek the top element of the stack
    public int peek() 
    {
        if(isEmpty()){
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
