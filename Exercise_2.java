//Time Complexity - O(1)
//Space Complexity - O(n) - n is the number of elements in the stack
//Leetcode - Yes
public class Exercise_2 { 
  
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
        //check if the stack is empty by checking if root is null
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        //Creates a new node and puts it at the front of the list which will be the top. 
       
        //If the stack was empty, it directly sets the root to this new node, 
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {     //otherwise, we rearrange the pointers to insert the new node at the beginning
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    //Checks if the stack is empty. If not, it removes the node from the front of the list 
    if (isEmpty()) {
        System.out.println("Stack Underflow");
        return 0;
    } else {
        int popped = root.data;
        root = root.next;
        return popped;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
