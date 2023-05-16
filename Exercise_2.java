// Time Complexity : O(1) as there is no looping and there are constant number of steps
// Space Complexity : O(n) as there can be n elements in a linked list and no fixed number of elements is given
// Did this code successfully run on Leetcode : Don't know where to check this on leetcode instead I ran this locally
// Any problem you faced while coding this : Had to check how to write linked list logic for stack mainly when we pop an element
// Approach: While pushing the element to the stack we make the new entered element as the root node

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
        if(root==null){
            System.out.println("Stack is empty");
            return true;
        }else{
            return false;
        }
         
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.

        if(root==null){
            root = new StackNode(data);
        }else{
            StackNode oldNode = root;
            root = new StackNode(data);
            root.next = oldNode;
        } 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int popped = root.data;
            root = root.next;
            return popped;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()==false){
            return root.data;
        }else{
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
        // sll.pop();
        // sll.pop();
        // sll.pop();
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
