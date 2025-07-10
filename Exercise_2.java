// Time Complexity :
// isEmpty: o(1)
// push: o(1)
// pop: o(1)
// peek: o(1)
// Space Complexity :
// isEmpty: o(1)
// push: o(1)
// pop: o(1)
// peek: o(1)
// Did this code successfully run on Leetcode : Cant find it on linkedin
// Any problem you faced while coding this : Started coding with o(n) complexity and realized to make it o(1)
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
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        // Initialize a new node with given data
        StackNode stackNode = new StackNode(data);

        // If there is no existing data, assign the new node as root and return
        if(root == null) {
            root = stackNode;
            return;
        }

        // If there is data, traverse and assign this node at the start of linkedlist
        stackNode.next = root;
        root = stackNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else if (root.next==null) {
            int data = root.data;
            root=null;
            return data;
        }
        //Write code to pop the topmost element of stack.
        // pop the data from the root and make sure to assign the next element as root
        int data = root.data;
        root = root.next;
        return data;
	//Also return the popped element 
    } 
  
    public int peek() 
    {
        if(root==null) return 0;
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
