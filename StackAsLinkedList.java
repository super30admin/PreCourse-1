public class StackAsLinkedList { 
  
    StackNode root;
    int count;
    public StackAsLinkedList(){
        root = null;
        count=0;
    }
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        return count==0;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(count==0){
            root = new StackNode(data);
            count++;
        }
        else{
            StackNode topElement = new StackNode(data);
            topElement.next = root;
            root = topElement;
            count++;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(count == 0) {
            System.out.println("Stack is Underflow");
            return 0;
        }
        StackNode topElement = root;
        root = topElement.next;
        count--;
        return topElement.data;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(count == 0) {
            System.out.println("Stack is Underflow");
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
