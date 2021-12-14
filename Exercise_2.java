class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data=data;
        } 
    }

    StackNode top;
    StackAsLinkedList()
    {
        this.top = null;
    }
    public boolean isEmpty() 
    {
        return top == null;
    } 
  
    public void push(int data) 
    {
        // create new node temp and allocate memory
        StackNode temp = new StackNode(data);

        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = data;

        // put top reference into temp link
        temp.next = top;

        // update top reference
        top = temp;
    } 
  
    public int pop() 
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return 0;
        }
        int x=0;
        x= top.data;
        // update the top pointer to point to the next node
        top = (top).next;
        return x;



    } 
  
    public int peek() 
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
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
