public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            next = null;
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
        if(isEmpty()){
            StackNode temp = new StackNode(data);
            temp.next = null;
            root = temp;
            System.out.println("Successfully pushed" + temp.data + "onto stack"); 
        }
        else{
            StackNode temp = new StackNode(data);
            temp.next = root;
            root = temp;
            System.out.println("Successfully pushed" + temp.data + "onto stack"); 
        }
    } 
  
    public int pop() 
    { 	
    //If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()){
        System.out.println("Stack underflow");
        return 0;
    }
        //Write code to pop the topmost element of stack.
    //Also return the popped element
    else{
        int value = root.data;
        root=root.next;
        return value;
    } 
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