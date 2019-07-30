public class Exercise_2{
    static class StackAsLinkedList { 
    
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
            //Write your code here for the condition if stack is empty. 
            if(root == null){
                return true;
            }
            return false;
        } 
    
        public void push(int data) 
        { 
            //Write code to push data to the stack. 
            if(root == null){
                root = new StackNode(data);
            }
            else{
                StackNode temp = root;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new StackNode(data);
            }
        } 
    
        public int pop() 
        { 	
            //If Stack Empty Return 0 and print "Stack Underflow"
            if(root == null){
                System.out.println("Stack is underflow");
                return 0;
            }
                //Write code to pop the topmost element of stack.
            StackNode temp = root;
            StackNode prev = null;
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            return temp.data;
            //Also return the popped element 
        } 
    
        public int peek() 
        { 
            //Write code to just return the topmost element without removing it.
            if(root == null){
                return 0;
            }
            StackNode temp = root;
            while(temp.next != null){
                temp = temp.next;
            }
            return temp.data;
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
