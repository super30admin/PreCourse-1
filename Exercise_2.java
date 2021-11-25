import java.util.EmptyStackException;

class StackAsLinkedList { 
  
    StackNode root; 
    private StackNode top;
    private int size;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return size == 0;
    } 
  
    public void push(int data) 
    { 
        StackNode tempNode = new StackNode(data);
        tempNode.next = top;
        top = tempNode;
        size++;
        System.out.println( data + " is pushed to stack");
    } 
  
    public int pop(){ 	
        if (isEmpty()){
            System.out.println("No element can be popped");
            throw new EmptyStackException();
    }
        int result = top.data;
        top = top.next;
        size--;
        return result;
    } 
  
    public int peek() 
    { 
        if (isEmpty()){
            System.out.println("No element found");
            throw new EmptyStackException();
            
        }
        return top.data;
    } 
}
	//Driver code

    class Main1{
    public static void main(String[] args){ 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        // System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 