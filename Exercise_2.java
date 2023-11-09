/**
 * Time complexity is O(1) for push(), pop(), peek(), and isEmpty()
 * Space complexity is O(n)
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
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
        System.out.println("Pushed " + data + " to the stack"); 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        
        StackNode poppedElement = root;
        root = root.next;
        System.out.println("Popped " + poppedElement.data + " from the stack");
        return poppedElement.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        System.out.println("Stack top: " + root.data);
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
