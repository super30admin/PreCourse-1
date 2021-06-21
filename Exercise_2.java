// Exercise_2 : Implement Stack using Linked List.

public class StackAsLinkedList { 
  
    StackNode root; 
    int top=0; // Size of the elements in the linked list 
  
    static class StackNode { 
        int data; // value given to the node
        StackNode next; // next node
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data=data; 
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(top==0)
        {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
            StackNode tempNode = new StackNode(data);
            tempNode.next= root;
            root=tempNode;
            top++;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int result = root.data;
        root = root.next; // null value
        top--;
	//Also return the popped element 
    return result;
    } 
  
    public int peek() 
    { 
        //Check if stack is empty
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to just return the topmost element without removing it.
        int result = root.data;
        return result;

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
