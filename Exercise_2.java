// Time Complexity : O(1) - Push, Pop, Peek , O(N) - Search
// Space Complexity : O(N) - N: Number of items/elements in the stack.
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

public class StackAsLinkedList { 
  
    StackNode root; 
  
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
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        //Step 1: create node
        StackNode node = new StackNode(data);
        if(node == null){
            System.out.println("Heap/Stack Overflow");
            return;
        }
        //make connection with the exiting stack/linkedlist
        node.next = root;
        //make the new node as root(top most element)
        root = node;
    } 
  
    public int pop() 
    { 	
        int result;
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
    //Write code to pop the topmost element of stack.
        else{
            result = root.data; //save the data value of the top most node
            root = root.next; //shift the root to its next node so the current node is removed and collected by garbage collector
        }
	//Also return the popped element 
        return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return root.data;
        }
    } 

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


      







 

