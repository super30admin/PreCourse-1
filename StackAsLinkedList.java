//Time Complexity :
//push-O(1), pop-O(1), peek-O(1)
//Space Complexity:O(n)
//The code runs successfully in terminal
//Problems Faced: Understanding the pointer updates while pushing and popping elements
public class StackAsLinkedList { 
  
    StackNode root; 
  
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
        //Write your code here for the condition if stack is empty. 
return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
	newNode.next = root;
	root = newNode;
	//Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	if (isEmpty()){
		System.out.println("Stack Underflow");
		return 0;
	}//If Stack Empty Return 0 and print "Stack Underflow"
        int popped = root.data;
	root = root.next;
	return popped;//Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if (isEmpty()){
		System.out.println("Stack is Empty");
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
