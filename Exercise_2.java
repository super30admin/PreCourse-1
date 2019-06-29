public class StackAsLinkedList { 
  
    StackNode root; // this is also called as the head of the linked list.

    int top; // this variable is for keep track of the stack top
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;  // Initially we have the data incoming and assign the data element to StackNode data part
            this.next = null;  // At first , the next is pointer is pointing towards Null.
        } 
    } 
    
    //Using the constructor to initialize the top element
    public StackAsLinkedList(){
        top = -1;
    }

	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
         if(top == -1){ // or we can write the top<0
            return true;
        }else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        // Here we need to insert the date in to linked list and point the next pointer to next element in linked list.
        StackNode a = new StackNode(data);
        a.next= root;  // point the current node to head of the linked list i.e. root.
        root = a;      // assign the root or head to current stack node object;
        top++;         // increment the top value.

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    if(root!=null){
        StackNode temp = root; //getting the root i.e head value
        root = root.next; //changing the root to next root value.
        --top;             // decrementing the top number;
        return temp.data;  // returning the first temp data i.e pop the top value
    }else
    {
        System.out.print("Stack Underflow");
        return 0;
    }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
