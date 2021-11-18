
public class StackAsLinkedList { 
    int result;
    StackNode root; 
    StackNode tail=null;
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root==null){
            root=new StackNode(data);
            root.next=null;
            tail=root;
        }
        else{
            StackNode curr=root;
            while(curr.next!=null){
                curr=curr.next;
            }
            StackNode temp=new StackNode(data);
            curr.next=temp;
            tail=temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        if(root==null){
            System.out.println("Stack Underflow");
        }
        else{
            result=tail.data;
            StackNode curr=root;
            while(curr.next!=tail){
                curr=curr.next;
            }
            tail=curr;

        }
        return result;
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null){
            return 0;
        }else{
                
            return tail.data;
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
