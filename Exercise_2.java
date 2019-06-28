public class StackAsLinkedList { 
  
    StackNode root = null; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
        } 
    } 
    
	StackAsLinkedlist() 
    { 
        this.root = null; 
    } 
    public boolean isEmpty() 
    { 
        return root == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
         if (root == null) { 
            System.out.print("Stack Underflow"); 
            return 0; 
        } 
  
        // update the top pointer to point to the next node 
        int a = root.data;
        root = (root).next;
        return a;


    } 
  
    public int peek() 
    { 
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
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
