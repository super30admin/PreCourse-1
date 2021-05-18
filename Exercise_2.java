class StackAsLinkedList {
  
    StackNode root; 
  
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
        StackNode newNode = new StackNode(data);
        if(root != null) {
            root.next = newNode;
        }
        root = newNode;
    } 
  
    public int pop() 
    {
        int retVal = 0;
        if(root == null) {
            System.out.println("Stack Underflow");
        } else {
            retVal = root.data;
            root = root.next;
        }
        return retVal;
    } 
  
    public int peek() 
    {
        if (root != null) {
            return root.data;
        }
        return 0;
    }
}
public class Exercise_2 {
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