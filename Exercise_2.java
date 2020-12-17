public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next= null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
/******* Approach 1 *******/
//           StackNode node = new StackNode(data);
//
//           if (isEmpty()) {
//               root = new StackNode(data);
//           }
//           else {
//               StackNode cur = root;
//               while (cur.next != null) {
//                   cur = cur.next;
//               }
//               cur.next = node;

/******* Approach 2 *******/
            if (isEmpty()) {
                root = new StackNode(data);
            }
            else
            {
              StackNode node = new StackNode(data);
              node.next = root;
              root = node;
           }
        }

  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

     int poppedElement;
            if (isEmpty())
            {
                System.out.println("Stack Underflow");
                poppedElement = 0;
            }
/******* Approach 1 *******/
//            else
//            {
//                StackNode cur = root;
//                StackNode prev = null;
//                while (cur.next != null)
//                {
//                    prev = cur;
//                    cur = cur.next;
//                }
//                poppedElement = cur.data;
//                prev.next = null;
//            }
/******* Approach 2 *******/
            else
            {
                    poppedElement = root.data;
                    root = root.next;
            }
            return poppedElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
         if (isEmpty())
                return Integer.MAX_VALUE;

/******* Approach 1 *******/
//            StackNode cur = root;
//            StackNode prev = null;
//            while (cur != null)
//            {
//                prev = cur;
//                cur = cur.next;
//            }
//            return prev.data;
/******* Approach 2 *******/
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


// Time Complexity : O(1) for Approach 2
//                 : O(N) for Appraoch 1
// Space Complexity : O(N) - N is the no.of elements of stack
// Did this code successfully run on Leetcode : I executed it on IntelliJ IDE and it ran fine
// Any problem you faced while coding this : I came up with Approach 1 initially and then tried to improve it using Approach 2

// Your code here along with comments explaining your approach : self explanatory