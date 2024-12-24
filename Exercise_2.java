// Time Complexity : isEmpty() -> O(1); push() -> O(1); peek() -> O(1); pop() -> O(1);
// Space Complexity : O(N), where N represents the maximum length of the stack;
// Did this code successfully run on Leetcode : Not Found
// Any problem you faced while coding this : As I am doing in a vscode editor, I feel like this confused me a bit while i was initially solving as its not an interaface I generally do like leetcode that checks for all and edge testcases. However this is a good start as it stresses my brain to think individually with out any dependency on other helpers.

// Your code here along with comments explaining your approach:
// 1. The "root" StackNode which initially represents null which is for pointing the root of the linkedlist or we can say top element in the stack.
// 2. This root varibale is being moved backward(by inserting a new node at the beginning of the LL) when an item is pushed to a stack and move the root pointer to next using .next when an item popped form the stack.
// 3. Using this variable, I was able to check for errors and excpetions in O(1) while pushing and popping.

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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        //Write code to push data to the stack. 
        if (isEmpty()){
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int poppedElement = root.data;
        root = root.next;
        return poppedElement;

	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
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
