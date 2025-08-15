// Time Complexity :
//   push()  -> O(1)
//   pop()   -> O(1)
//   peek()  -> O(1)
//   isEmpty()-> O(1)
// Space Complexity : O(n) where n is the number of nodes (because we add nodes as we push)
// Any problem you faced while coding this :
//   - Remember to update the head (root) when pushing or popping.
//   - Always check empty before popping or peeking to avoid null pointer issues.
// Your code here along with comments explaining your approach
//   - A stack using a singly linked list. 'root' points to the top node.
//   - push: create a new node, point its next to current root, then move root to new node.
//   - pop: read root.data, move root to root.next, return old data. Handle empty case.
//   - peek: return root.data without removing. Handle empty case.
class StackAsLinkedList { 
  
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
        return root == null; // Stack is empty if root is null
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
         // Create new node and put it on top
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
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
        // Take the top data and move root down
        int Popped = root.data;
        root = root.next;
        return Popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
         // Return the topmost element without removing it
        if (isEmpty()) { 
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
