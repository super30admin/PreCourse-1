public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode top = null;
  
        StackNode(int data) 
        { 
            //Constructor here 

            this.data = data;
            this.next = null;
            this.top = null;
        } 
       
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(top == null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode new_node = new  StackNode(data);

        if(top == null){
            top = data;
        }
        else
        {
            new_node.next = top;
            top = new_node;
        }
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
    else{
        top = top.next;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.

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

// Time Complexity : 0(1)
// we can push n number of elements in linked list bcz we dont have any size restriction like array. We can pop any element at begining
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Here I am initilising one linked list by taking top as head. If I want to push one element I will just push it at the begining. Then my top will be assigned to newNode.next and newnode will be assigned to top.
// Top pop one element I will just assign top.next to top. In LinkedList there is no constant memory so there will be no overflow.