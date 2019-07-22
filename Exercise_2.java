public class StackAsLinkedList { 
  
    StackNode root; 

    //To keep track of the last node in the Stack
    StackNode top;
  
    static class StackNode { 
        int data; 
        StackNode next = null; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        }
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(this.top == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        if(this.isEmpty()) {
            root = node;
            top = node;
        }

        top.next = node;
        top = top.next;
    } 
  
    public int pop() 
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
            //Write code to pop the topmost element of stack.
        //Also return the popped element 
        if(this.isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Temporary pointer to find the previous element
        StackNode temp;
        temp = root;
        while(temp.next != top) {
            temp = temp.next;
        }

        int poppedData = top.data;
        temp.next = null;
        top = temp;
        return poppedData;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.isEmpty()) {
            System.out.println("Stack Empty");
            return 0;
        }
        return top.data;
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
