public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;//Constructor here 
        } 
    } 
	
    public boolean isEmpty() 
    { 
        return root == null;//Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode();
 
        if (temp == null) {
            System.out.print("\nStack Overflow");
            return;
        }
 
        temp.data = data;
        temp.next = root;
        root = temp;
    } 
  
    public int pop() 
    { 	
        if (root == null) {
            System.out.print("\nStack Underflow");
            return 0;
        }
        else{
            return root.data;
        }
 
        root = (root).next;//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
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