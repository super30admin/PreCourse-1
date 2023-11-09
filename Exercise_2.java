class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        if(root == null){
            return true;
        }
        return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    {
        if(root == null){
            StackAsLinkedList.StackNode node = new StackNode(data);
            this.root = node;
            node.next = null;
        }else{
            StackAsLinkedList.StackNode temp = root;
            while(temp.next != null){
                temp = temp.next;
            }
            StackAsLinkedList.StackNode node = new StackNode(data);
            temp.next = node;
        }
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    {
        if(root == null){
            System.out.println("stack underflow");
            return 0;

        }else{
            StackAsLinkedList.StackNode temp = root;
            while(temp.next.next != null){
                temp = temp.next;
            }
//            temp  = temp.next;
            int x = temp.next.data;
            temp.next = null;
            return x;

        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    {
        if (root == null){
            return 0;
        }
        StackAsLinkedList.StackNode temp = root;

        while(temp.next!=null){
            temp = temp.next;

        }
        return temp.data;
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
