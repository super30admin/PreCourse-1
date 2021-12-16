

//Time Complexity : is O(1) as we are adding element in the front and also deleting from front;
//Space complexity is O(N) as we are adding N elements to the linkedList

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data = data;
           next = null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
       return root == null; 
    } 
  
    public void push(int data) 
    { 
      Node temp = new Node();
      temp.data = data;
      temp.next = root;
      root = temp; 
    } 
  
    public int pop() 
    { 	
      if (root == null)
        throw new LinkedListException();
      int val = root.next;
      root = root.next;
      return val; 
        
	 
    } 
  
    public int peek() 
    { 
        if(!isEmpty()){
        return root.data;
    } 
     else {
          System.out.println("Stack is underflow");
          return -1;
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
