// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class StackAsLinkedList {
  
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
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(root == null){
            root = node;
        }
        else{
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
        System.out.println("Data pushed to the stack " + data);

    } 
  
    public int pop() 
    {
        int m = Integer.MIN_VALUE;

        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        else{
            m = root.data;
            root = root.next;
        }
        //Also return the popped element
        return m;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        else{
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println("Popped from stack: " + sll.pop());
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
