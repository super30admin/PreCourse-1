//time complexity 
//push and pop operations is O(1) because we are adding and removing elements from the top of the stack. 
//The space complexity is O(n) where n is the number of elements in the stack, as we are using a linked list to store the elements.

public class StackAsLinkedList { 
  
    private StackNode root; 
  
    private static class StackNode { 
        private int data; 
        private StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        if (root == null) {
            root = new StackNode(data);
        }
        else {
            StackNode node = new StackNode(data);
            node.next = root;
            root = node;
        }
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int popped = root.data;
            root = root.next;
            return popped;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    {
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
        //Write code to just return the topmost element without removing it.
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
