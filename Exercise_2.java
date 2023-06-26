//Time Complexity : O(1) Push and pop takes only one cycle.
//Space Complexity : O(1) No additional space used.
//Did this code successfully run on Leetcode : Didn't find this problem on leet code,Ran on editor and it was successful.
//Any problem you faced while coding this : No
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        //Add the new data into the new node and place it in the root
        StackNode newNode = new StackNode(0);
        newNode.data = data;
        newNode.next = root;
        //Put old top node as root's next node
        root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }
    int value = root.data;
    root = root.next;
    return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return -1;
        }
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
