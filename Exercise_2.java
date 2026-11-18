//time complexity 
//push and pop operations is O(1) because we are adding and removing elements from the top of the stack. 
//The space complexity is O(n) where n is the number of elements in the stack, as we are using a linked list to store the elements.


public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;  //every node contains data.
            this.next = null;  //refers to the next node in the stack.
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root == null; //if root is null then stack is empty.
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(root == null){                   //if root is null then creat a new node and assign it to root.
            root = new StackNode(data);
        } else{
            StackNode newNode = new StackNode(data);    //or else create a new node and assign it to the next of root and then assign the new node to root.
            newNode.next = root;
            root = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"

        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write code to pop the topmost element of stack.
        int popped = root.data;  //store the data of the root in a variable.
        root = root.next;  //assign the next of root to root.
	   //Also return the popped element 
        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack Underflow");  //check if the stack is empty and return 0.
            return 0;
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
