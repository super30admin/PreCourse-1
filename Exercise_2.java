// Time Complexity : push takes O(1), pop takes O(n), peek takes O(n).
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : didn't provide the links
// Any problem you faced while coding this : nope


// Your code here along with comments explaining your approach
class StackAsLinkedList { 
  
    StackNode root;
    StackNode tail;
  
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
    
	public StackAsLinkedList()
    {
        root = null;
        tail = null;
    }
    public boolean isEmpty() 
    {
        if(root == null)
            return true;
        else
            return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(root == null)
        {
            root = new StackNode(data);
            tail = root;
        }
        else
        {
            tail.next = new StackNode(data);
            tail = tail.next;
        }
    } 
  
    public int pop() 
    { 	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        StackNode temp = root;
        int x = tail.data;
        if(tail == root)
            root = tail = null;
        else
        {
            while(temp.next != tail)
                temp = temp.next;
            tail = temp;
        }
        return x;
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(tail == null)
            return 0;
        return tail.data;
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
