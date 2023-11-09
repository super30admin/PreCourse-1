// Time Complexity :
    //Push: O(1)
    //Pop: O(1)
    //peek: O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach :  used root as dummy node and root.next as top of stack

class StackAsLinkedList {
  
    StackNode root = new StackNode(0);
  
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
        return current == root;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node =  new StackNode(data);
        node.next = root.next
        root.next = node;
    }
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (root.next == null) return 0;
        //Write code to pop the topmost element of stack.
        int result = root.next.data;
        root.next = root.next.next;
	//Also return the popped element
        return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) return root.next.data;
        return 0;
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
