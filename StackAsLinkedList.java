// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :  I did not find this question on leetcode
// Any problem you faced while coding this : to keep the time complexity o(1) we have to do puch pop on first node so keep track of first node in root node.

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
        //first create new node and link into current root
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
        

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()){
      System.out.println("Stack Underflow");
      return 0;
    }
    
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    int popped = root.data;
    root = root.next;
    return popped;

    } 
  
    public int peek() 
    { 
        if(isEmpty()){
            System.out.println("Empty stack");
            return 0;
        }
        //Write code to just return the topmost element without removing it.
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

        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 

        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 

} 
