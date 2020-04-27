/*
isEmpty method:
Time complexity O(1)
Space complexity O(1)

push method:
Time complexity O(1)
Space complexity O(1)

pop method:
Time complexity O(1)
Space complexity O(1)

peek method:
Time complexity O(1)
Space complexity O(1)
*/

class StackAsLinkedList { 
  
    StackNode root; 

    StackAsLinkedList() {
        this.root = null;
    }
  
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
        return this.root == null; 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode sn = new StackNode(data);
        sn.next = this.root;
        this.root = sn;
    } 
   
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        if(this.isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int popElement = this.root.data;
        this.root = this.root.next;
        return popElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return this.root.data;
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
