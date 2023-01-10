// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/* The root node of linked list acts as the top of stack. Whenever element is pushed a node is added at beginning of linked list
   and root is updated to point to the same. Whenever an element is popped the root node's element is returned and root then just 
   points to next element of linked list. Root null means linked list and thus the stack is empty
*/

class StackAsLinkedList { 
  
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
        if(root == null)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root == null)
            root = new StackNode(data);
        else {
            StackNode node = new StackNode(data);
            node.next = root;
            root = node;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int data = root.data;
            root = root.next;
            return data;
        }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
            return 0;

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
