public class StackAsLinkedList { 
  
    StackNode root;
    int size;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(size==0){return true;}
        return false;
    } 
  
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
        if(size==0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int number = root.data;
            root = root.next;
            size--;
            return number;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(size==0){return 0;}
        else{
            return root.data;
        }
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
