
// Time Complexity : O(1)
// Space Complexity : O(n)
class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	private StackNode top;
    StackAsLinkedList () {
        this.top = null;
    }
    public boolean isEmpty() 
    { 
        return top == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack");
    } 
  
    public int pop() 
    { 	
	if(top == null){
        System.out.println("Stack Underflow");
        return 0;
    } else{
        int x = top.data;
        top = top.next;
        return x;
    }
    } 
  
    public int peek() 
    { 
        if (top == null){
            System.out.println("Stack Is Empty");
            return 0;
        } else {
            return top.data;
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
