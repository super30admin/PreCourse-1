//Time Complexity for push pop and peed is O(1) and space complexity is also O(1) as my top element is in the beginning
public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data=data;
            next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode=new StackNode(data);
        if(isEmpty()){
            root=newNode;
        }
        else{
            newNode.next=root;
            root=newNode;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty())
            return 0;
        int popElement=root.data;
        root=root.next;
        return popElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
