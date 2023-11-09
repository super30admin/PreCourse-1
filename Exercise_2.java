/*
 Time Complexity :
    1. push method: O(1)
    2. pop method: O(1)
    3. peek method: O(1)
 */

/*
  Space Complexity :
    1. push method: O(1)
    2. pop method: O(1)
    3. peek method: O(1)
 */

// Did this code successfully run on Leetcode :N/A
// Any problem you faced while coding this : I updated the StackAsLinkedList class as class instead of Public class to make it run

/*
 Stack as LinkedList,
 1. Create a new node and push element there for the push method
 2. pop element from the top and shift next pointer to the next top
 3. Peek method will return the top most element
 */
class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode {
        int data;
        StackNode next;
        StackNode(int data)
        {
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
        StackNode newNode = new StackNode(0);
            newNode.data = data;
            newNode.next = root;
            root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int val = root.data;
        root = root.next;
        return val;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }else{
            System.out.println("Stack is empty");
            return -1;
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
