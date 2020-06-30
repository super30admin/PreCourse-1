// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root== null)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(isEmpty()){
            root = new StackNode(data);
        }else{
            StackNode temp = new StackNode(data);
            temp.next = root;
            root = temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        int result = 0;
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else{
            result = root.data;
            root = root.next;
        }
        return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        int result = 0;
        if(isEmpty()){
            System.out.println("Stack Empty");
        }else{
            result = root.data;
        }
        return result;
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
