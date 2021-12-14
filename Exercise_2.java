/* Time Complexity : O(1) for isEmpty(), push() and peek() operation.
                     O(N) for pop() operation where N is the max size of stack data  
 Space Complexity : O(N) where N is max size of stack.
 Did this code successfully run on Leetcode :
 Any problem you faced while coding this : Yes. I faced problem in pop ooperation 
                                        in finding second to last element to remove from the stack
*/
public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode tail;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
        StackNode(){

        }
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null){
            return true;
        }else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data); 
        if(isEmpty()){
            //if stack is empty, create new stack and add new data and make that as tail
            root = new StackNode();
            root = newNode;
            tail = newNode;
        }else{
            //if stack is not empty, append the new data to the tail and make it the new tail
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int pop() 
    { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
            //Write code to pop the topmost element of stack.
        //Also return the popped element 
        int val = 0;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return val;
        }else{
            //if only one emlement is present in the stack, remove it and set the stack and tail to empty
            if(root.next == null){
                val = root.data;
                root = null;
                tail = null;
                return val;
            }

        StackNode last = new StackNode();
        StackNode sendToLast = new StackNode();
        last = root;
        sendToLast = root;
        
        if(last != null){
            last = last.next;
            val = last.data;
        }
        
        while(last != null && sendToLast != null && last.next != null){
            last = last.next;
            sendToLast = sendToLast.next;
            val = last.data;
        }
        //sendToLast points to second to last and last points to last element
        sendToLast.next = null;
        last = null;
        tail = sendToLast;
        return val;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
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
