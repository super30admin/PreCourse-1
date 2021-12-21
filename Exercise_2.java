//The time complexity for all push(), pop(), and peek() operations is:
// O(1) as we are not performing any kind of traversal over the list. 
//We perform all the operations through the current pointer only.

//Space complexity:O(1), which means that the complexity is constant. Every time we push an element, 
//we'll perform exactly the same number of operations, add element, and change two pointers.

// Did this code successfully run on Leetcode: I am getting one error while initializing constructor at StackNode(int data) 
// Any problem you faced while coding this : I had to first understan how to create a node class and how linkedlist works. Then initially 
// i faced syntactical errors and also struggled with writing the code for push()


import static java.lang.System.exit;

//Create Stack using Linked list
public class StackAsLinkedList { 
  
    
    StackNode root; 
  
    //Linked list node
    static class StackNode { 
        int data;  //integer data
        StackNode next;  //reference variable node type
    
        //Create global top reference variable global
        StackNode top; 
  
        StackNode(int data)
        
        { 
            
            //Constructor here 
           d = data;
           next = null;
            
           
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return top == null;
    } 
  
    public void push(int d) 
    { 
        //Write code to push data to the stack. 
        //Create an empty node
        StackNode temp = new StackNode();
        
        //check is stack is full
        if(top == null){
            System.out.println("Stack overflow");
            return;
        }
        
        //initialize data into temp data file
        
        temp.data = d;
        
        //put top reference into temp link
        
        temp.next = top;
        
        //update top reference
        top = temp;
            
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(top == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        
           // update the top pointer to point to the next node
        top = (top).next;
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        //check stack is underflow
        
        if(!isEmpty()){
            return top.d;
        }else{
            System.out.println("Stack underflow");
            return -1;
        
        }
    } 
    
    public void display(){
        
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            StackNode temp = top;
            while (temp != null) {
 
                // print node data
                System.out.printf("%d->", temp.data);
 
                // assign temp link to temp
                temp = temp.next;
            }
        }
    }

	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        
        sll.display();
        sll.pop();
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 

}