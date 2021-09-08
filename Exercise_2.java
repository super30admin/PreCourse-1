// Time Complexity : O(1)
// Space Complexity : O(1)
class StackAsLinkedList {
  
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
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
    } 
  
    public int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }else{
            StackNode ret = root;
            root = root.next;
            return ret.data;
        }
    } 
  
    public int peek() 
    {
        return root.data;
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
