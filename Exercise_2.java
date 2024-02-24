public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
            next=null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null){
            return true;
        }
        else {
            return false;
        }

        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode temp=new StackNode(data);
        if(temp==null){
            System.out.println("Stack overflow");
        }
        else{
            temp.data=data;
            temp.next=root;
            root=temp;
        }
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        if(isEmpty()){
            System.out.println("stack underfloe");
            return 0;
        }
        int x=root.data;
        root=root.next;
        return x;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(!isEmpty()){
            return root.data;
        }
        else{
            System.out.println("Stack is Empty");
            return -1;
        }
        //Write code to just return the topmost element without removing it.
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
