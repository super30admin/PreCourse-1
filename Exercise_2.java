// Time Complexity : Push = O(1); Pop = O(1); Peek = O(1)
// Space Complexity : O(n) 

// Did this code successfully run on Leetcode : Link not available

// Any problem you faced while coding this : Brushing up linkedlist concept 


class StackAsLinkedList {  //Name of the file has to be same for public class
  
    StackNode root; 
  
    static class StackNode {  //inner class is made static so that main() can access it.
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
        if(root != null)
            return false;
        return true;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        if (root != null){
           // root.next = newNode;
            newNode.next = root;
            root = newNode;
        } else {
            root = newNode;
        }
    } 
  
    public int pop() 
    { 	        
        // if stack not empty then pop the top element 
        if(!isEmpty()) {
            int temp = root.data;
            root = root.next;
            return temp;
        }
        //If empty return 0 and print " Stack Underflow"
        System.out.println("Stack Underflow");
        return 0;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        } else {
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10);  
        sll.push(20); 
        sll.push(30); 
  
        /* 
        System.out.println(sll.pop() + " popped from stack"); 
        
        System.out.println("Top element is " + sll.peek()); 
        */

        for (int i = 0; i < 4; ++i) {
            if (!sll.isEmpty()) {
                System.out.println(sll.peek());
            }
            System.out.println(sll.pop());
        }
    } 
} 
