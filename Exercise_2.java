// TC push, peek, isEmpty 0(1) 
// pop O(n)

public class StackAsLinkedList { 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
        } 
    } 

    StackNode top;
    StackNode temp;
    StackNode head;
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return top==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode n= new StackNode(data);
        if(top==null){
            top=n;
            head=n;
            temp=n;
            return;
        }
        
        top.next=n;
        top=n;
        return;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        
        if(head==null){
            System.out.println("Stack underflow");
            return 0;
        }
        int val=top.data;
        if(head.next==null){
            head=null;
            temp=null;
            top=null;
            return val;
        }
        temp=head;   
        while(temp.next!=top){
            temp=temp.next;
        }
        top=temp;
        top.next=null;
        return val;
        
    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(top!=null){
            return top.data;
        }
        System.out.println("Stack underflow");
        return 0;
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

        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 

        System.out.println(sll.isEmpty()); 

        sll.push(30); 
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.isEmpty()); 
    }  
} 
