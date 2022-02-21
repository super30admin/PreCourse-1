// Time Complexity :
/*
PUSH, POP, PEEK Operations : O(1)
*/
// Space Complexity :
/*
PUSH, POP, PEEK Operations : O(1)
*/



// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
Initialized root with null

For isEmpty() : Chekcing value of root is null ?  -> then Stack is Empty else it is non-Empty

For push(): Creating new StackNode with given value, inserting that new node at head

For pop(): If stack underflow(root = null) then return 0 otherwise then just return the value of root node and assign the value of root with root.next

For peek(): Return the value of root node

*/
 class StackAsLinkedList { 
  
    StackNode root; 

    StackAsLinkedList(){
        this.root = null;
    }
  
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
        
        StackNode node = new StackNode(data);
        
        if(root == null){
            root = node;
            return;
        }

        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

        if(isEmpty()){
            System.out.println("Stack Underflow");

            return 0;
        }

        int data = root.data;
        root = root.next;

        return data;
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
