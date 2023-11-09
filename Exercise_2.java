//Time  and space Complexities are of order O(1) for all operations of the stack 
//Code ran Successfully
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if  (root == null) {
        	return true;
        }
        else
        	return false;

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp= new StackNode(data);
    	
    	  
          // put top reference into temp link
          temp.next = root;
    System.out.print(temp.data);
    System.out.print('\n');

          // update top reference
          root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	
    if (root == null) {
        System.out.print("\nStack Underflow");
        return 0;
    }

    // update the top pointer to point to the next node
   // System.out.print(root.data);
    int x= root.data;
      root = (root).next;

    return(x);
    } 
  
    public int peek() 
    { 
//Write code to just return the topmost element without removing it.
    	if (!isEmpty()) {
            return root.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
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