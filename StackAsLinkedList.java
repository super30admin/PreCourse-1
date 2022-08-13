

//time complexity - O(1)
//space complexity- 0(1000)
public class StackAsLinkedList 
{ 
  
    StackNode root; 
    int size;
  
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
        return size == 0;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode tempnode = new StackNode(data);
        tempnode.next = root;   
        root = tempnode;
        size++;
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(!isEmpty())
    {
    int data = root.data;
    root = root.next;
    size--;
    return data;
    }
    else{
        System.out.println("Stack underflow");
        return 0;
    }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty())
        {
        return root.data;
        }
        else{
            return 0;
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
