import java.net.SocketPermission;

// Time Complexity :    O(1)
// Space Complexity :   O(n)
// Did this code successfully run on Leetcode : Not found on leetcode
// Any problem you faced while coding this : No

 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data; //Initializing the stacknode data
        } 
    } 
    
	
     boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null)
            return true;// indicates empty stack
        else
            return false;
    } 
  
     void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next=root; //the new element is added to the beginning of the linkedlist.
        root=newNode;  //root points to the newly pushed element at the top
    } 
  
     int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root==null){
            System.out.println("Stack Underflow"); //Indicates stack is empty
            return 0;
        }
        int poppedElement=root.data; //This is the top element
        root=root.next; //Point the root to the element below the top which is going to be the top element now
        return poppedElement;
    } 
  
     int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null){
            System.out.println("Stack Underflow"); //Indicates stack is empty
            return 0;
        }
        else{
            return root.data;
        }

    } 
}
	//Driver code
    public class Exercise_2{
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

