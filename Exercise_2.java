//Time Complexity: push: O(1) since we are always adding the element at the head of the linked list, pop: O(1), peek: O(1), isEmpty: O(1)
//Space Complexity: O(1) since we do not count the space of the output
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
        return this.root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if (this.root == null) {
            this.root = new StackNode(data);
        } else {
            StackNode temp = new StackNode(data);
            temp.next = this.root;
            this.root = temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if (this.root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popped = this.root.data;
            this.root = this.root.next;
            return popped;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (this.root == null) {
            return 0;
        } else {
            return this.root.data;
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
