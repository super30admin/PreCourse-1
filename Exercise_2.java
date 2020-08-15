public class Exercise_2 { 
  
    StackNode root, top;
    int size = 0; 
  
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
        return size == 0;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(size == 0) {
            root = new StackNode(data);
            top = root;
            size++;
        }
        else{
            StackNode newNode = new StackNode(data);
            newNode.next = top;
            top = newNode;
            size++;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        int returnVal;
        if(size == 0) {
            System.out.println("Stack Underflow");
            return 0; 
        }
        else{
            size--;
            returnVal = top.data;
            top = top.next;
        }
        return returnVal;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(size > 0)
            return top.data;
        else return 0;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 s = new Exercise_2(); 
  
        s.push(10); 
        s.push(20); 
        s.push(30);
        s.push(40);

        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.isEmpty()); 
        System.out.println(s.peek()); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty());
    } 
} 
