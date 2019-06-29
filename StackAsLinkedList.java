public class StackAsLinkedList { 
  
    StackNode root; 
  
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root == null){
        System.out.println(" Stack Underflow ");
        return 0;
    }
    else {
        int result = root.data;
        root = root.next;
        return result;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root != null)
            return root.data;
        else{
            System.out.println(" Stack Empty ");
        return 0;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
       System.out.println(sll.isEmpty() + " popped from stack"); 
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.isEmpty()+" isEmpty"); 
        System.out.println(sll.peek()+" Peeked from stack ");
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println(sll.peek()+" Peeked from stack "); 
        System.out.println(sll.pop() + " Popped from stack");
        
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println(sll.peek() + " Popped from stack");

        for(int i=0;i<1010;i++){
            sll.push(100);
        } 
        System.out.println(sll.peek() + " Popped from stack");    
        
    } 
} 
