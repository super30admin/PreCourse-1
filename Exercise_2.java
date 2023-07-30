public class StackAsLinkedList { 
    // Time Complexity = O(n)
  //Space Complexity =  O(n)
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            data = data;
            next = null;
            //Constructor here 
        } 

        StackAsLinkedList(){
            root = null;
        }
    } 
    
	
    public boolean isEmpty() 
    { 
        return (root == null);
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode();
        temp.data = data;
        temp.next = root;
        root = temp;
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int value = root.value;
        root = root.next;
        return value;

	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(!isEmpty()){
            return top.data;
        }
            System.out.println("Stack is Empty");
            return -1;
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
