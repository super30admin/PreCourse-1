public class StackAsLinkedList { 
  
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
        return root == null || root.next == null;
    } 
  
    public void push(int data) 
    {
        StackNode newNode  = new StackNode(data);
        if(isEmpty()){
            root = new StackNode(-1);
            root.next = newNode;
        }
        else{
            newNode.next = root.next;
            root.next = newNode;
        }
    } 
  
    public int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

        int popped = root.next.data;
        root.next = root.next.next;

        return popped;
    } 
  
    public int peek() 
    {
        if(root ==null || root.next==null){
            return -1;
        }
        return root.next.data;
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
