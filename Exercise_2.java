// Time Complexity : O(n); n = #nodes in linkedlist
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Not found on leetcode
// Any problem you faced while coding this : No

class StackAsLinkedList  {
  
    StackNode root; 
    int top = -1;
    StackNode curr;
    StackNode prev = new StackNode(-1);

    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            next = null;
        } 
    } 
    
	//time complexity: O(1)
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if (top == -1)
            return true;
        return false;
    } 

    //time complexity: O(n); n = #nodes in linkedlist
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);

        if (isEmpty()) {
            root = node;
            curr = root;
            prev.next = root;
        }
        else {
            curr.next = node;
            prev = curr;
            curr = curr.next;
        }
        top++;
    } 

    //time complexity: O(n)
    public int pop() 
    { 	

        //Write code to pop the topmost element of stack.

        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("stack underflow");
            return 0;
        }

        int res = curr.data;

        //if Stack has only one element
        if (top == 0) {
            top--;
            root = null;
            return res;
        }
        StackNode tmp = new StackNode(-1);
        tmp.next = root;
        while (tmp.next != prev) {
            tmp = tmp.next;
        }
        curr = prev;
        prev = tmp;
        curr.next = null;
        top--;
        return res;//Also return the popped element
    } 

    //time complexity: O(1)
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("stack is empty");
            return 0;
        }
        return curr.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    {

        StackAsLinkedList  sll = new StackAsLinkedList ();
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek());

    } 
} 
