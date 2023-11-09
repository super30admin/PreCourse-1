class StackAsLinkedList { 

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

    StackNode root; 
    int size;

    StackAsLinkedList(){
        root = null;
        size =0;
    }

    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 

        return root == null;
    } 
    // TC : O(1)   SC : O(1)
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
        size++;

        

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 

    if(root == null) {
        System.out.println("Stack underflow");
        return 0;
    }

    int removedItem = root.data;
    root = root.next;
    StackNode temp = root;
    size--;
    return removedItem;


    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null) {
            System.out.println("Stack is empty");
            return 0;
        }
        return root.data;


    } 
}

public class Exercise_2{
//Driver code
    public static void main(String[] args) 
    { 

    StackAsLinkedList sll = new StackAsLinkedList(); 

    sll.push(10); 
    sll.push(20); 
    sll.push(30); 
    
   
    System.out.println( sll.pop() + " popped from stack"); 

    System.out.println("Top element is " + sll.peek()); 
}

}
  
	 

