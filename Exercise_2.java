// Time Complexity :
//    push(): O(1)
//    pop(): O(1)
//    peek(): O(1)
//    isEmpty(): O(1)

// Space Complexity : O(n)
public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;  
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data); 
        newNode.next = root;
        root = newNode;  
    } 
  
    public int pop() throws Exception
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if (isEmpty()) { 
            throw new Exception("Stack Underflow");  
        } 
        int popped = root.data; 
        root = root.next;
        return popped; 
    } 
  
    public int peek() throws Exception
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) { 
            throw new Exception("Stack is Empty"); 
        } 
        return root.data; 
    } 
  
	//Driver code
    public static void main(String[] args) throws Exception
    { 
  
        Exercise_2 sll = new Exercise_2(); 
        try{
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        }catch(Exception e){
            throw e;
        }
    } 
} 
