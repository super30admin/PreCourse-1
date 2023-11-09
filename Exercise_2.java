// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was confused a bit with execution and logic but was finally able to work it out
class StackAsLinkedList { 
  
    // StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode(int data) 
        { 
            //Constructor here 
            data = data;
            next = null;
        } 
    } 

    StackNode top;
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(top == null){
            return true;
        }else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        if(temp == null){
            System.out.print("Overflow");
        } 
        temp.data = data;
        temp.next = top;
        top = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(top==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        top = top.next;
        return top.data;
    } 
  
    public void peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }else{
            StackNode temp = top;
            while(temp!=null){
                System.out.print(temp.data);
                temp = temp.next;
            }
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        sll.peek();
    } 
} 
