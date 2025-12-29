// Time Complexity : o(1)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : N/A it is not a leetcode problem
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
// steps to implement stack using LinkedList
//1 create node with data and next node. Intialize the constructor node with data.
//2 push : create new node and assign top of next node to new node
//3 pop: keep top node in temporary node and assing top to next node.
//4 peek: check for empty stack. if Not return top node data.
class StackAsLinkedList { 
  
    private StackNode top; 

    public StackAsLinkedList() 
    { 
        //Initialize your constructor 
        top = null;
    }
    
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(top == null){
            return true;
        }else{
            return false;
        }

    } 
  
    public void push(int data) 
    {  
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data +"Pushed into stack");       
       
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(top == null){
        System.out.println("Stack underflow");
        return 0;
    }
        StackNode temp = top;
        top = top.next;
        int val = temp.data;
        temp = null;
        return val;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(top == null){
            System.out.println("stack is null");
            return -1;
        }
        return top.data;
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
