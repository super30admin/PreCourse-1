// Time Complexity : push, pop and peek operations --> O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


public class StackAsLinkedList { 
  
    StackNode root; //points to the top of the stack
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;//Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root==null; //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) //time: O(1), space: O(1)
    { 
        StackNode new_node = new StackNode(data); //creating a new node
        new_node.next = root; //new node points to the top of the list
        root = new_node; //new node is reassigned as the top
    } 
  
    public int pop() //time: O(1), space: O(1)
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root == null) //checks if list is empty
        {
            System.out.println("Stack Underflow"); 
            return 0;
        }

        int temp = root.data; //saves root data before we unlink it from the list
        root = root.next; //moving root to the current top element in stack
        return temp; //returning saved value

    } 
  
    public int peek() //time: O(1), space: O(1)
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null) //checking if there's any elements in the list
            return -1;
        return root.data; //returning the root node data which is top of the stack
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
