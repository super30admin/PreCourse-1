/*
Time Complexity:
   push: O(1)
   pop: O(1)
   peak: O(1)

Space Complexity:
   push: O(1)
   pop: O(1)
   peak: O(1)
 */
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
        System.out.println("Pushed to stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int popped_val = root.data;
        root = root.next;
        return popped_val;
	//Also return the popped element 
    } 
  
    public int peek() 
    {
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
