public class Exercise_2 { 
  
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
        if(root==null)
        return true;
        else
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root==null)
        {
            root = new StackNode(data);
        }
        else{
            StackNode temp = root;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = new StackNode(data);
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root==null){
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        StackNode temp = root;
        StackNode prevNode = new StackNode(-1);
        while(temp.next!=null)
        {
           prevNode = temp;
           temp = temp.next;
        }
        prevNode.next = null;
        return temp.data;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    if(root==null){
        System.out.println("Stack is Empty");
        return -1;
    }
    else{
        StackNode temp = root;
        while(temp.next!=null)
        {
           temp = temp.next;
        }
        return temp.data;
    }        
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
