public class StackAsLinkedList {
    
      StackNode root; 
      
        static class StackNode { 
            int data; 
            StackNode next;  

        } 
        StackNode top;
        public StackAsLinkedList() {
            this.top=null;
        }
        
        public boolean isEmpty() 
        {
            return top==null; 
            //Write your code here for the condition if stack is empty. 
        } 
      
        public void push(int data) 
        { 
            StackNode temp = new StackNode(); 
            // check if stack (heap) is full. Then inserting an
            //  element would lead to stack overflow
            if (temp == null) {
                System.out.print("\nHeap Overflow");
                return;
            }
            temp.data = data;
            
            // put top reference into temp link
            temp.next = top;
     
            // update top reference
            top = temp;
        } 
      
        public int pop() 
        {
                
        //If Stack Empty Return 0 and print "Stack Underflow"
            //Write code to pop the topmost element of stack.
        //Also return the popped element 
             if (top == null) {
                    System.out.print("\nStack Underflow");
                    return 0;
                }
             
             // updating top pointer to the next node
             int deletedele=top.data;
             top=top.next;
             return deletedele;

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
    
    
    
    
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         StackAsLinkedList sll = new StackAsLinkedList(); 
          
            sll.push(10); 
            sll.push(20); 
            sll.push(30); 
      
            System.out.println(sll.pop() + " popped from stack"); 
      
            System.out.println("Top element is " + sll.peek()); 

    }

}
