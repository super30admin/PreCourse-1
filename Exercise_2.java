/* TC - 
    O(1) for isEmpty(), peek();
    O(n) for push(), pop();
*/
// SC - O(n)

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
        if(root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(root == null) {
            root = node;
        } else {
            StackNode head = root;
            while(head.next != null) {
                head = head.next;
            }
            head.next = node;
        }
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else if(root.next == null) {
            int result = root.data;
            root = null;
            return result;
        }else {
            StackNode head = root;
            while(head.next.next != null) {
                head = head.next;
            }
            int result = head.next.data;
            head.next = null;
            return result;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null) {
            System.out.println("Stack Underflow");
            return -1; // returning -1 if there is not element exists.
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
