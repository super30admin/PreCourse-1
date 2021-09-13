// Time Complexity :O(1)
// Space Complexity :O(1)
class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode {

        int data;
        StackNode next; 
  
        StackNode()
        { 
            //Constructor here


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
        StackNode temp = new StackNode();
        if(temp == null){
            System.out.println("Stack Overflow");
            return;
        }

        temp.data = data;
        temp.next = root;
        root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    int x = root.data;
    if(root == null){
        System.out.println("Stack Underflow");
        return 0;
    }
    root = root.next;
    return x;
    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    if(!isEmpty()){
        return root.data;
    }
    else{
        System.out.println("Stack is Empty");
        return -1;
    }
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
