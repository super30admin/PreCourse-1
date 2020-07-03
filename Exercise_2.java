public class Exercise_2 { 
  
    StackNode root;
    int size;
    StackNode top;
  
    static class StackNode { 
        int data;
        StackNode next;
        StackNode prev;
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(size==0)
            return false;

        return true;
    } 
  
    public void push(int data) 
    { 
        if(size==0)
        {
            root=new StackNode(data);
            root.next=null;
            root.prev=null;
            top=root;
        }
        StackNode temp=top;
        top.next=new StackNode(data);
        top=top.next;
        top.prev=temp;
        top.next=null;

        size+=1;
        //Write code to push data to the stack. 
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    if(size==0)
            return 0;

        int result=0;
        if(size==1)
        {
            result=top.data;
            top=null;
        }
        else{
        result=top.data;
        top=top.prev;
        top.next=null;
        }
        size-=1;

        return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(top!=null || size!=0)
            return top.data; 
        
        return 0;
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
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        sll.push(45);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
