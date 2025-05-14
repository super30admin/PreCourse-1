package Exercise_2;
// Time Complexity : push- O(1), pop- O(n), peek- O(1), isEmpty- O(1)
// Space Complexity : O(n), where n is the number of nodes
// Any problem you faced while coding this : no problem in this question
public class StackAsLinkedList {

    // head of the linked list
    StackNode root;
    // to keep track top of the stack
    StackNode top;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        // root is null then no linked list exist
        if(root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    {
        // create a new node using data
       StackNode node = new StackNode(data);
       // root is null means no list exist till now
       if(root == null) {
           root = node;
           top = root;
       } else {
           // add element to the top
           top.next = node;
           // update the top
           top = node;
       }
    } 
  
    public int pop() 
    { 	
	    int temp;
        //checking for underflow
        if(root == null) {
            System.out.println("Stack Underflow!!");
            return 0;
        } else {
            StackNode node = root;
            StackNode prev = null;
            while(node.next != null) {
                // prev will point to the second last node
                prev = node;
                node = node.next;
            }
            // storing value of the top node of stack
            temp = top.data;
            // top of stack updated
            top = prev;
            // removing the top of stack or the last node
            top.next = null;
        }
        return temp;
    } 
  
    public int peek() 
    { 
        if(root == null) {
            return -1;
        }
        // top of the stack
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
