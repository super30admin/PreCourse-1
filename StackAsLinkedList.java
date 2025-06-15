// Time Complexity:
// push() - O(1)
// pop() - O(1)
// peek() - O(1)
// isEmpty() - O(1)
//
// Space Complexity:
// O(n) overall to store 'n' nodes in the stack
// O(1) auxiliary space


public class StackAsLinkedList { 
    /* The root node will represent the current node or the last node added to the stack or the topmost element in the stack */
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
    
	/* This function will tell us if the stack is empty or not:
     * 1. We know that root represents the last element added to the stack so, if root == null then we know that our stack is empty hence, we will return true
     * 2. Else we will return false that the stack is not empty since root is not null
     */
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null) return true;
        return false;
        
    } 

    /* This function is used to add new node to the stack:
     * 1. We will make a new node named curr 
     * 2. we will check if the stack is empty or not, if the stack is empty then we will make the root node as the current node
     * 3. If the stack is not empty and we  also know that the root MUST represent the current node added to the stack so we will make the current node point to the root node and make the root node as the current node
    */
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode curr = new StackNode(data);
        if(root == null){
            root = curr;
        }
        else{
            curr.next = root;
            root = curr;
        }
    } 
  /* This function is used to delete the topmost element in the stack and is this code it is represented by the root node
   * 1. If the root == null that means that the stack is empty and we will return 0
   * 2. Else, we will save the data of the root node in the popped element and make the element present in root.next as the root(which means that previously the element which was present in the next is now the topmost element) and we will return the poppedElement
   */
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        else{
            int poppedElement = root.data;
            root = root.next;
            return poppedElement;
        }
	//Also return the popped element 
    } 
  /* This function will return the top element in the stack which is represented by the root node:
   * If the root == null then the stack is empty and return 0
   * else return root.data
   */
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack Underflow");
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
