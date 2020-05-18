//Time Complexity:O(1)
//Space Complexity:O(1)

class StackAsLinkedList {
    public class StackNode {
        int data;
        StackNode next;

        StackNode(int da)
        {
            this.data=da;
        }
    }
    StackNode root;
    
	
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
        StackNode temp= new StackNode(data);
        temp.next=root;
        root=temp;


    } 
  
    public int pop() 
    { 	int x=0;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        if(isEmpty())
        {
            System.out.println("Stack Underflow");

        }
        else
        {
            x=root.data;
            root=root.next;
        }
	    return x;
    } 
  
    public int peek() 
    { 
       return root.data;
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
