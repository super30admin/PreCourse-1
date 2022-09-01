/*
Time Complexity: O(1) for all operations
Space Complexity: O(n)
Did this code successfully run on Leetcode : N/A
Any problem you faced while coding this : No
*/

public class StackAsLinkedList { 
  
    StackNode root;
    StackNode first;
   
  
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
        if(root==null)
        return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(node);
        if(first==null){
            first= temp;
            root = temp;
        }
       else{
        root.next = temp;
        root = temp;
       }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    StackNode temp = new StackNode(-1);
    int num=root.data;
    temp.next = first;
    while(temp.next.next!=root){
        temp=temp.next;
    }
    temp.next=null;
    root=temp;
    return num;
      
    } 
  
    public int peek() 
    { 
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
    } 
} 
