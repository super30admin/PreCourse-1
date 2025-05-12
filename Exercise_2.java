// Time Complexity : For N elements; push and pop is O(N) 
// Space Complexity : For N elements: push and pop is O(N)
// Note: I have considered that I will be doing operations (pop and push) from one end of the linked list

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
        if (this.root == null) {
            return true;
        } return false;
    } 
  
    public void push(int data) 
    { 
        StackNode new_node = new StackNode(data);
        //Write code to push data to the stack.
        //Check if the stack is empty
        if (isEmpty()){
            //if empty replace the root node
            this.root = new_node;
        } //else insert at the end of the root node which is the top of the stack
        else {
            // make the new node point to the head node
            new_node.next = this.root;
            // later replace the root node with the newly pointed head node which contains new data
            this.root = new_node;
        }
    } 
  
    public int pop() 
    // this is a LIFO / FILO operation. Last in First out / First in Last out
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if (this.isEmpty()) {
        System.out.println("Stack Underflow");
        return 0;
    }
    //Write code to pop the topmost element of stack.
    //Use root to traverse to the end of the list (which is the top of the list).
    // Note that we are removing and add nodes from one end of the linked list
    // Store the topmost element
    int popped_ele = this.root.data;
    // we are shifting the reference of the root to the next node
    this.root = this.root.next;


	//Also return the popped element 
    return popped_ele;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (this.isEmpty()) {
            return 0;
        } else {
            return this.root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
