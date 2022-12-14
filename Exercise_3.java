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
        if(root==null){
            return false;
        }
        return true;
    }
    public void push(int data) {
        //Write code to push data to the stack.
        StackNode s = root;
        if (root == null) {
            s = new StackNode(data);
            root = s;
        }
        else {
            while (s.next != null) {
                s = s.next;
            }
            StackNode s1 = new StackNode(data);
            s.next = s1;
        }
    }
    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root==null){
            System.out.println("Stack Underflow");
        }
        //Write code to pop the topmost element of stack.
        StackNode s=root;
        StackNode s1=root.next;
        if(s1==null){
            int val=s.data;
            s=null;
            return val;
        }
        while(s1.next!=null){
            s1=s1.next;
            s=s.next;
        }
        s.next=null;
        //Also return the popped element
        return s1.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root ==null){
            return -1;
        }
        StackNode s= root;
        while(s.next!=null){
            s=s.next;
        }
        return s.data;

    }
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
//TIME COMPLEXITY O(N) ADD,Peek, isEmpty O(1).
//SPACE COMPLEXITY CONSTANT SINCE INPUT IS GIVEN
