/* Time complexity of each operation is : O(1)
   Space complexity is : O(1) */

public class StackAsLinkedList {  
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 

    static class Stack{
        StackNode root;     
        Stack()
        {
            root = null;
        }
    }
    
	
    public boolean isEmpty() 
    { 
        return root == null; 
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode(data);
           
             
              if(root != null){
                root = temp;
                  System.out.println(data + " is pushed into the stack successfully !!");
                  return;
            }
               
              temp.next = root;
              root = temp;
              System.out.println(data + " is pushed into the stack successfully !!");
    } 
     
  
    public int pop() 
    { 	
        StackNode temp;
           
            if (root == null) 
                System.out.println("Stack Underflow !");
            
           
            else {
                
                temp = root;
                System.out.println("Element that popped out from the stack is: " + temp.data);
                root = root.next;
            }
    } 
  
    public int peek() 
    { 
        if (!isEmpty()) 
            return root.data;
        
        else {
            System.out.println("Stack is Empty !");
            System.exit(1);
        }
        return 0;
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
 
