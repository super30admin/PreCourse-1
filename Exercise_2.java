//Time complexity for push: O(1)
//Time complexity for pop: O(1)
//Time complexity for peek: O(1)
//Space complexity for push: O(1)
//Space complexity for pop: O(1)
//Space complexity for peek: O(1)
class StackAsLinkedList {

    //store the top most element of the stack
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        // Store the root in a temp node and assign the new node to root
        StackNode temp = root;
        root = new StackNode(data);

        //point the next pointer of the root to the temp(previous node0 node
        root.next = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int ans = peek();
        root = root.next;

        return ans;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        //return top most element from the stack
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
