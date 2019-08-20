public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if (root == null)
            return true;

        return false;
    } 
  
    public void push(int data) 
    { 
        if (root == null) {
            root = new StackNode(data);
        } else {
            StackNode temp = root;
            root = new StackNode(data);
            root.next = temp;
        }
    } 
  
    public int pop() 
    { 	        
        int popped = 0;
        if (root == null) {
            System.out.println("Stack Underflow");
        } else {
            popped = root.data;
            root = root.next;
        }

        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        int popped = 0;
        if (root == null) {
            System.out.println("Stack Underflow");
        } else {
            popped = root.data;
        }
        return popped;
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
