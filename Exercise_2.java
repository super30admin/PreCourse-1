public class StackAsLinkedList {
 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) { 
            this.data = data;
        } 
    }

    StackNode top;
    StackAsLinkedList() {
        this.top = null;
    }
    
	
    public boolean isEmpty() { 
        //Write your code here for the condition if stack is empty. 
        return top == null;
    } 
  
    public void push(int data) { 
        //Write code to push data to the stack. 
        StackNode node = new Node(data);
        node.next = top;
        top = node;
    } 
  
    public int pop() { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        if (top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        top = top.next;
    } 
  
    public int peek() { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty) {
            return top.data;
        } else {
            System.out.println("Stack is empty : Stack Underflow");
            return -1;
        }
    } 
  
	//Driver code
    public static void main(String[] args) { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
