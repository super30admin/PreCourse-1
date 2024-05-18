// Time Complexity : push - O(1), pop-O(n), peek - O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO


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
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null){
            return true;
        }
        return false;
    } 

    StackNode last;
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(isEmpty()){
            root = new StackNode(data);
            last = root;
        }
        else{
            last.next = new StackNode(data);
            last = last.next;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    StackNode temp = root;

    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }
    while(temp.next != null && temp.next.next != null ){
        temp = temp.next;
    }
    int popped; 
    if( last == temp){
        popped = last.data;
        root = null;
        last = null;
    }
    else{
    popped = last.data;
    temp.next = null;
    last = temp;
    }
    return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return -1;
        }
        return last.data;
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
