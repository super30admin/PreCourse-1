// Time Complexity : O(1) for Push,Pop,Peek and IsEmpty operations.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : It ran successfully in VSCode.
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

// For push operation if the root node is null then assign the new node inserted as root otherwise 
// make the incoming node's next value as root and change root to the newly inserted node.
// For pop operation first check if the stack is empty throw an error message in case of empty stack
// otherwise create a temporary node and assign root as it's value, change the root to it's next node and remove 
// the reference. For peek operation check if the stack is empty, in case of empty stack throw an error message 
// and return -1 otherwise return the data value of root node.

class StackAsLinkedList { 
  
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
        else {
            return false;
        } 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode sn = new StackNode(data);
        if(root==null){
            root = sn;
        }
        else{
            sn.next = root;
            root = sn;
        }

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
        else{
            StackNode temp = new StackNode(root.data);
            temp = root;
            root = root.next;
            temp.next = null;
            return temp.data;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
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

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek()); 
    } 
} 
