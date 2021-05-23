class StackAsLinkedList { 
  
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
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()) {
        System.out.println("Stack Underflow");
    }
        //Write code to pop the topmost element of stack.
        int temp = root.data;
        root = root.next;
	//Also return the popped element 
    return temp;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()) {
            return root.data;
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    } 
}
  
public class Exercise_2 {
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.isEmpty());
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
