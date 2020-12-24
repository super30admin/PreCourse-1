//public class StackAsLinkedList { 
public class Exercise_2 {
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
        if(isEmpty()){
            root = node;
        }
        else{
            StackNode temp = root;
            root = node;
            root.next = temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        int poppedElement = 0;
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            poppedElement = root.data;
            root = root.next;
            return poppedElement;
        }
        
    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
        
        //StackAsLinkedList sll = new StackAsLinkedList(); 
  
        Exercise_2 sll = new Exercise_2();
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
