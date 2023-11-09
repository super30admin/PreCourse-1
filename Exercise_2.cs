class StackAsLinkedList { 
  
    StackNode Root;
  
    class StackNode { 
        public int Data; 
        public StackNode Next; 
  
        public StackNode(int data) 
        { 
            //Constructor here 
            this.Data = data;
        } 
    } 
    
	// Time Complexity : O(1) 
    // Space Complexity : O(1)
    bool IsEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return Root == null;
    } 
  
    // Time Complexity : O(1) 
    // Space Complexity : O(1)
    void Push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode n = new StackNode(data);
        n.Next = Root;
        Root = n;
    } 
  
    // Time Complexity : O(1) 
    // Space Complexity : O(1)
    int Pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        if(IsEmpty())
        {
            Console.WriteLine("Stack Underflow");
            return 0;
        }else{
            StackNode temp = Root;
            Root = Root.Next;
            return temp.Data;
        }

    } 
  
    // Time Complexity : O(1) 
    // Space Complexity : O(1)
    int Peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return IsEmpty() ? -1 : Root.Data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.Push(10); 
        sll.Push(20); 
        sll.Push(30); 
  
        Console.WriteLine(sll.Pop() + " popped from stack"); 
  
        Console.WriteLine("Top element is " + sll.Peek()); 
    } 
}