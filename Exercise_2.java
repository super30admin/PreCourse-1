/* isEmpty() : TC: O(1) SC:O(1)
   push() : TC: O(1) SC:O(1)
   pop() : TC: O(1) SC:O(1)
   peek() : TC: O(1) SC:O(1) */
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;//Constructor here 
        } 
    } 
    StackNode head = null;
    
	
    public boolean isEmpty() 
    { 
        if(head == null)
            return true;
        return false;//Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode(data);
        if(temp == null){
            System.out.println("Stack overflow");
            return;}
        temp.next = head;
        head = temp;//Write code to push data to the stack. 
    } 
  
    public int pop() 
    {   if(head == null){
        System.out.println("Stack Underflow");
        return 0;}
        int top = head.data;
        head = head.next;
        return top;	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { if(head == null){
        System.out.println("Stack Underflow");
        return 0;}
        return head.data;
        //Write code to just return the topmost element without removing it.
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
